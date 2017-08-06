package com.bjtu.examsys.controller;

import com.bjtu.examsys.aspect.HttpAspect;
import com.bjtu.examsys.domain.ExamPaper;
import com.bjtu.examsys.domain.Question;
import com.bjtu.examsys.domain.Result;
import com.bjtu.examsys.domain.SelectionQuestion;
import com.bjtu.examsys.service.QuestionService;
import com.bjtu.examsys.utils.GsonUtil;
import com.bjtu.examsys.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
    public Result<Question> getAllQuestion() throws Exception {
        return questionService.getAllQuestions();
    }

    @DeleteMapping(value = "/examsys/question/{questionIds}")
    public Result deleteQuestion(@PathVariable("questionIds") String questionIds) {
        return  questionService.deleteQuestionByIds(questionIds);
    }

    @PostMapping(value = "/examsys/question")
    public Result addQuestion(@RequestBody String addQuestionJson) {
        return ResultUtil.success(GsonUtil.parseJsonWithGson(addQuestionJson,
                SelectionQuestion.class));
    }

    @PostMapping(value = "/examsys/question/{type}")
    public Result addQuestions(@PathVariable("type") String type, @RequestParam("time") String time, @RequestParam("occupation") String occupation, @RequestParam("difficulty") String difficulty, @RequestParam("score") String score, @RequestParam("content") String content, @RequestParam("answer") String answer, @RequestParam("analysis") String analysis) throws Exception {
        return questionService.addQuestions(type, time, occupation, score, difficulty, content, answer, analysis);
    }

    @GetMapping(value = "/examsys/exam")
    public Result<ExamPaper> getExamQuestions(@RequestParam("occupation") String occupation, @RequestParam("time") String time){
        logger.info("occupation:   "+ occupation);
        return questionService.getExamQuestions(occupation,time);
    }
}
