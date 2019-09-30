package com.org.questions.populators;

import com.org.questions.model.QuestionModel;
import com.org.questions.services.QuestionService;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commerceservices.search.resultdata.SearchResultValueData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import org.spockframework.util.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SearchResultQuestionCountPopulator implements Populator<SearchResultValueData, ProductData> {
    private QuestionService questionService;

    @Override
    public void populate(SearchResultValueData searchResultValueData, ProductData productData) throws ConversionException {
        Assert.notNull(searchResultValueData, "Parameter source cannot be null.");
        Assert.notNull(productData, "Parameter target cannot be null.");
        String pk = searchResultValueData.getValues().get("pk").toString();
        List<QuestionModel> questionsByProductCode = questionService.getQuestionsByProductCode(pk);
        productData.setQuestionCount(questionsByProductCode.size());
    }

    @Autowired
    public void setQuestionService(QuestionService questionService) {
        this.questionService = questionService;
    }
}
