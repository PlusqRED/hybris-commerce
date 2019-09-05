package com.org.questions.controllers.cms;

import com.org.questions.facades.QuestionFacade;
import de.hybris.platform.addonsupport.controllers.cms.AbstractCMSAddOnComponentController;
import de.hybris.platform.cms2.model.contents.components.AbstractCMSComponentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;

@Controller
public class QuestionsCMSComponentController extends AbstractCMSAddOnComponentController {

    private QuestionFacade questionFacade;

    @Override
    protected void fillModel(HttpServletRequest request, Model model, AbstractCMSComponentModel component) {
        model.addAttribute("productsWithQuestions", questionFacade.getProductsWithQuestions());
    }

    @Autowired
    public void setQuestionFacade(QuestionFacade questionFacade) {
        this.questionFacade = questionFacade;
    }
}
