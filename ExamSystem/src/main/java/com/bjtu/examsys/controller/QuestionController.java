package com.bjtu.examsys.controller;

import com.bjtu.examsys.aspect.HttpAspect;
import com.bjtu.examsys.domain.Question;
import com.bjtu.examsys.domain.Result;
import com.bjtu.examsys.service.QuestionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Wjl on 2017/7/30.
 */
@RestController
public class QuestionController {
    private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);

    @Autowired
    private QuestionService questionService;

    @GetMapping(value = "/examsys/question")
    public Result<Question> questionReturn(@RequestParam("questionId") Integer questionId) throws Exception {
        return questionService.questionReturn(questionId);
    }

//    @PutMapping(value = "/examsys/question/test")
//    public  void test(@RequestParam("occupations") String[]  ocus){
//        logger.info(ocus.toString());
//    }
}
