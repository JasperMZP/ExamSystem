package com.bjtu.examsys.controller;

import com.bjtu.examsys.aspect.HttpAspect;
import com.bjtu.examsys.domain.Exam;
import com.bjtu.examsys.domain.Result;
import com.bjtu.examsys.service.ExamService;
import com.bjtu.examsys.utils.GsonUtil;
import com.bjtu.examsys.utils.ResultUtil;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
public class ExamController {
    private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);

    @Autowired
    private ExamService examService;

    @PostMapping(value = "/examsys/exam")
    public Result addExam(@RequestParam("userId") String userId,@RequestParam("occupation") String occupation,@RequestParam("testScore") String testScore,@RequestParam("time") String time,@RequestParam("type") String type,@RequestParam("score") String score,@RequestParam("difficulty") String difficulty,@RequestParam("content") String content,@RequestParam("answer") String answer,@RequestParam("examAnswer") String examAnswer,@RequestParam("analysis") String analysis,@RequestParam("result") String result) throws  Exception{
        return examService.addExam(userId,occupation,testScore,time,type,score,difficulty,content,answer,examAnswer,analysis,result);
    }
}
