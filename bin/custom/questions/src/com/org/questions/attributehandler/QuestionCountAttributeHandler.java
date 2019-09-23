package com.org.questions.attributehandler;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler;
import org.springframework.stereotype.Component;

@Component
public class QuestionCountAttributeHandler implements DynamicAttributeHandler<Integer, ProductModel> {
    @Override
    public Integer get(ProductModel model) {
        return model.getQuestions().size();
    }

    @Override
    public void set(ProductModel model, Integer integer) {

    }
}