package com.org.questions.facades.impl;

import com.org.questions.facades.QuestionFacade;
import com.org.questions.model.QuestionModel;
import com.org.questions.services.QuestionService;
import de.hybris.platform.cmsfacades.data.ProductData;
import de.hybris.platform.core.model.product.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import questions.data.QuestionData;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DefaultQuestionFacade implements QuestionFacade {

    private QuestionService questionService;

    @Override
    public ProductData getProductDataByProduct(ProductModel productModel) {
        List<QuestionModel> questionsByProductCode = questionService.getQuestionsByProductCode(productModel.getPk().toString());
        ProductData productData = new ProductData();
        productData.setQuestions(questionsByProductCode.stream()
                .map(this::toQuestionData)
                .collect(Collectors.toList()));
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
}
