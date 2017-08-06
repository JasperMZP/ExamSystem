package com.bjtu.examsys.service;

import com.bjtu.examsys.domain.Exam;
import com.bjtu.examsys.domain.Question;
import com.bjtu.examsys.domain.Result;

import java.util.List;

/**
 * Created by Wjl on 2017/7/29.
 */
public interface QuestionService {

    Result<Question> getAllQuestions() throws Exception;

    Result deleteQuestionByIds (String questionIds);

    Result addQuestions(String type,String time,String occupation,String score,String difficulty,String content,String answer,String analysis)throws  Exception;
    Result<Exam> getExamQuestions(String occupation,String time);
}
