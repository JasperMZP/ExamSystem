package com.bjtu.examsys.service;

import com.bjtu.examsys.domain.Question;
import com.bjtu.examsys.domain.Result;

/**
 * Created by Wjl on 2017/7/29.
 */
public interface QuestionService {
    Result<Question> questionReturn(Integer questionId) throws Exception;
    Result addQuestions(String type,String time,String occupation,String score,String difficulty,String content,String answer,String analysis)throws  Exception;
}
