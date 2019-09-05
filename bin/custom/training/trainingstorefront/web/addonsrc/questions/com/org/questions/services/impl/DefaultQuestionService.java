package com.org.questions.services.impl;

import com.org.questions.daos.QuestionDAO;
import com.org.questions.model.QuestionModel;
import com.org.questions.services.QuestionService;
import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultQuestionService implements QuestionService {

    private QuestionDAO questionDAO;

    @Override
    public List<QuestionModel> getQuestionByProductCode(final String code) throws AmbiguousIdentifierException, UnknownIdentifierException {
        return questionDAO.findQuestionsByProductCode(code);
    }

    @Autowired
    public void setQuestionDAO(QuestionDAO questionDAO) {
        this.questionDAO = questionDAO;
    }
}
