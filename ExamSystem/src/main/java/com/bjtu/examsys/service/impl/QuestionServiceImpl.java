package com.bjtu.examsys.service.impl;

import com.bjtu.examsys.dao.QuestionDao;
import com.bjtu.examsys.domain.Question;
import com.bjtu.examsys.domain.Result;
import com.bjtu.examsys.exception.SignException;
import com.bjtu.examsys.service.QuestionService;
import com.bjtu.examsys.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Wjl on 2017/7/29.
 */
@Service
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    private QuestionDao questionDao;

    @Override
    public Result<Question> questionReturn(Integer questionId) throws Exception{
        Question returnQuestion = questionDao.findQuestionByQuestionId(questionId);
        if(returnQuestion != null){
            return ResultUtil.success(returnQuestion);
        }
        throw new SignException(3, "gg");
    }

    @Override
    public Result addQuestions(String type,String time,String occupation,String score,String difficulty,String content,String answer,String analysis)throws  Exception{
        Question question = new Question();
        //question.setQuestionId(0);
        question.setQuestionType(type);
        question.setTime(time);
        question.setOccupation(occupation);
        question.setScore(score);
        question.setDifficulty(difficulty);
        question.setQuestionContent(content);
        question.setQuestionAnswer(answer);
        question.setQuestionAnalysis(analysis);
        if(questionDao.addQuestions(question) == 1)
            return ResultUtil.success();
        throw new SignException(1, "添加错误");
    }
}
