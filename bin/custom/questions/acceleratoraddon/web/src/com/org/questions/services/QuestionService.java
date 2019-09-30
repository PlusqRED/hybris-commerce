package com.org.questions.services;

import com.org.questions.model.QuestionModel;

import java.util.List;

public interface QuestionService {
    List<QuestionModel> getQuestionsByProductCode(String code);
}
