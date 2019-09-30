package com.org.questions.facades;

import de.hybris.platform.cmsfacades.data.ProductData;
import de.hybris.platform.core.model.product.ProductModel;

public interface QuestionFacade {
    ProductData getProductDataByProduct(ProductModel productModel);
}
