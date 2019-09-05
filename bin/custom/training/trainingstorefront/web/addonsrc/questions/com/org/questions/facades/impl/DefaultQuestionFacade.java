package com.org.questions.facades.impl;

import com.org.questions.facades.QuestionFacade;
import com.org.questions.model.QuestionModel;
import com.org.questions.services.QuestionService;
import de.hybris.platform.catalog.CatalogVersionService;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.cmsfacades.data.ProductData;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import questions.data.QuestionData;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DefaultQuestionFacade implements QuestionFacade {

    private QuestionService questionService;
    private ProductService productService;
    private CatalogVersionService catalogVersionService;

    @Override
    public List<ProductData> getProductsWithQuestions() {
        CatalogVersionModel catalogVersion = catalogVersionService.getCatalogVersion("Default", "Online");
        List<ProductModel> allProductsForCatalogVersion = productService.getAllProductsForCatalogVersion(catalogVersion);
        return allProductsForCatalogVersion.stream()
                .map(this::toProductData)
                .collect(Collectors.toList());
    }

    private ProductData toProductData(ProductModel productModel) {
        ProductData productData = new ProductData();
        List<QuestionData> questionDataList = questionService.getQuestionByProductCode(productModel.getCode()).stream()
                .map(this::toQuestionData)
                .collect(Collectors.toList());
        productData.setQuestions(questionDataList);
        return productData;
    }

    private QuestionData toQuestionData(QuestionModel questionModel) {
        QuestionData questionData = new QuestionData();
        questionData.setId(questionModel.getCode());
        questionData.setAnswer(questionModel.getAnswer());
        questionData.setAnswerCustomer(questionModel.getAnswerCustomer());
        questionData.setQuestion(questionModel.getQuestion());
        questionData.setQuestionCustomer(questionModel.getQuestionCustomer());
        return questionData;
    }

    @Autowired
    public void setQuestionService(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }
}
