package com.org.questions.controllers.cms;

import com.org.questions.facades.QuestionFacade;
import com.org.questions.model.QuestionsCMSComponentModel;
import de.hybris.platform.addonsupport.controllers.cms.AbstractCMSAddOnComponentController;
import de.hybris.platform.cmsfacades.data.ProductData;
import de.hybris.platform.core.model.product.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller("QuestionsCMSComponentController")
@RequestMapping(value = "/view/" + QuestionsCMSComponentModel._TYPECODE + "Controller")
public class QuestionsCMSComponentController extends AbstractCMSAddOnComponentController<QuestionsCMSComponentModel> {

    private QuestionFacade questionFacade;

    @Override
    protected void fillModel(HttpServletRequest request, Model model, QuestionsCMSComponentModel component) {
        ProductModel product = getRequestContextData(request).getProduct();
        ProductData productDataByProduct = questionFacade.getProductDataByProduct(product);
        model.addAttribute("questions", productDataByProduct.getQuestions());
        model.addAttribute("fontSize", component.getFontSize());
        model.addAttribute("numberOfQuestionsToShow", component.getNumberOfQuestionsToShow());
    }

    @Autowired
    public void setQuestionFacade(QuestionFacade questionFacade) {
        this.questionFacade = questionFacade;
    }
}
