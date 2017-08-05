package com.bjtu.examsys.service.impl;

import com.bjtu.examsys.aspect.HttpAspect;
import com.bjtu.examsys.dao.QuestionDao;
import com.bjtu.examsys.domain.Question;
import com.bjtu.examsys.domain.Result;
import com.bjtu.examsys.exception.SignException;
import com.bjtu.examsys.service.QuestionService;
import com.bjtu.examsys.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wjl on 2017/7/29.
 */
@Service
public class QuestionServiceImpl implements QuestionService {

    private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);

    @Autowired
    private QuestionDao questionDao;

    @Override
    public Result<Question> getAllQuestions() throws Exception {
        List<Question> questions = questionDao.getAllQuestions();

        logger.info("---all questions---" + questions.toString());

        if (questions != null) {
            return ResultUtil.success(questions);
        }
        throw new SignException(3, "gg");
    }

    @Override
    public Result deleteQuestionByIds(String questionIds) {
        String[] ids = questionIds.split("\\|");
        List<Integer> qIds=new ArrayList<Integer>();
        for (String id : ids) {
            qIds.add(Integer.parseInt(id));
        }
        if(questionDao.deleteQuestionByIds(qIds)==qIds.size()){
            return ResultUtil.success();
        }
        throw new SignException(4, "删除失败");
    }

    @Override
    public Result addQuestions(String type, String time, String occupation, String score, String difficulty, String content, String answer, String analysis) throws Exception {
        Question question = new Question();
        question.setQuestionType(type);
        question.setTime(time);
        question.setOccupation(occupation);
        question.setScore(score);
        question.setDifficulty(difficulty);
        question.setQuestionContent(content);
        question.setQuestionAnswer(answer);
        question.setQuestionAnalysis(analysis);
        if (questionDao.addQuestions(question) == 1)
            return ResultUtil.success();
        throw new SignException(1, "添加错误");
    }
}
