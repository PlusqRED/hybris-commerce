package com.org.questions.daos;

import com.org.questions.model.QuestionModel;

import java.util.List;

public interface QuestionDAO {
    List<QuestionModel> findQuestionsByProductCode(String code);
}
