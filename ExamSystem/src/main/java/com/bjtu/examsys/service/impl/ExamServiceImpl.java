package com.bjtu.examsys.service.impl;


import com.bjtu.examsys.aspect.HttpAspect;
import com.bjtu.examsys.dao.ExamDao;
import com.bjtu.examsys.domain.Exam;
import com.bjtu.examsys.domain.Result;
import com.bjtu.examsys.exception.SignException;
import com.bjtu.examsys.service.ExamService;
import com.bjtu.examsys.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;




@Service
public class ExamServiceImpl implements ExamService{
    private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);

    @Autowired
    private ExamDao examDao;


    @Override
    public Result addExam(String userId,String occupation,String testScore,String time,String type,String score,String difficulty,String content,String answer,String examAnswer,String analysis,String result) throws  Exception{
        Exam exam = new Exam();
        exam.setUserId(userId);
        exam.setOccupation(occupation);
        exam.setTestScore(testScore);
        exam.setTime(time);
        exam.setType(type);
        exam.setScore(score);
        exam.setDifficulty(difficulty);
        exam.setContent(content);
        exam.setAnswer(answer);
        exam.setExamAnswer(examAnswer);
        exam.setAnalysis(analysis);
        exam.setResult(result);
        if(examDao.addExam(exam) == 1)
            return ResultUtil.success();
        throw new SignException(1, "添加错误");

    }
}
