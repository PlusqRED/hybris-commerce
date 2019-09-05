package com.org.questions.daos.impl;

import com.org.questions.daos.QuestionDAO;
import com.org.questions.model.QuestionModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component(value = "questionDAO")
public class DefaultQuestionDAO implements QuestionDAO {

    @Autowired
    private FlexibleSearchService flexibleSearchService;

    @Override
    public List<QuestionModel> findQuestionsByProductCode(final String code) {
        final String queryString = //
                "SELECT {p:" + QuestionModel.PK + "}" //
                        + "FROM {" + QuestionModel._TYPECODE + " AS p} "//
                        + "WHERE " + "{p:" + QuestionModel.PRODUCT + "}=?code ";
        final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
        query.addQueryParameter("code", code);
        return flexibleSearchService.<QuestionModel>search(query).getResult();
    }
}