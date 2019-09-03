package com.org.questions.facades.impl;

import com.org.questions.facades.QuestionFacade;
import com.org.questions.services.QuestionService;
import de.hybris.platform.catalog.CatalogVersionService;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.cmsfacades.data.ProductData;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
        return null;
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
