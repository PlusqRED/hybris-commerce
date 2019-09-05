package com.org.questions.facades;

import de.hybris.platform.cmsfacades.data.ProductData;

import java.util.List;

public interface QuestionFacade {
    List<ProductData> getProductsWithQuestions();
}
