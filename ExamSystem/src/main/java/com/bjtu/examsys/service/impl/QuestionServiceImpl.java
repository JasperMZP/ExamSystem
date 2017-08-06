package com.bjtu.examsys.service.impl;

import com.bjtu.examsys.aspect.HttpAspect;
import com.bjtu.examsys.dao.QuestionDao;
import com.bjtu.examsys.domain.ExamPaper;
import com.bjtu.examsys.domain.ExamContext;
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
        List<Integer> qIds = new ArrayList<Integer>();
        for (String id : ids) {
            qIds.add(Integer.parseInt(id));
        }
        if (questionDao.deleteQuestionByIds(qIds) == qIds.size()) {
            return ResultUtil.success();
        }
        throw new SignException(4, "删除失败");
    }

    @Override
    public Result addQuestions(String type, String time, String occupation, String score, String difficulty, String content, String answer, String analysis) throws Exception {
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
        if (questionDao.addQuestions(question) == 1)
            return ResultUtil.success();
        throw new SignException(1, "添加错误");
    }

    @Override
    public Result<ExamPaper> getExamQuestions(String occupation, String time) {
        ExamPaper exam = null;
        switch (time) {
            case "1":
                exam=getQuestions(ExamType.SHOTEXAM,occupation);
                break;
            case "1.5":
                exam= getQuestions(ExamType.MIDDLEEXAM,occupation);
                break;
            case "2":
                exam= getQuestions(ExamType.LONGEXAM,occupation);
                break;
            default:
                throw new SignException(5, "获取试卷错误");
        }
        return ResultUtil.success(exam);
    }

    public ExamPaper getQuestions(ExamType examType,String occupation) {

        ExamContext examContext = new ExamContext();
        examContext.setQuestionNum(examType.getTotalNum());
        examContext.setSingleChoice(examType.getSingleChoiceNum());
        examContext.setMultipleChoice(examType.getMultipleChoiceNum());
        examContext.setJudge(examType.getJudgeNum());
        examContext.setCompletion(examType.getCompletionNum());
        examContext.setSimpleQuestion(examType.getSimpleQuestionNum());
        examContext.setCode(examType.getCodeNum());

        ExamPaper exam = new ExamPaper();
        exam.setContext(examContext);

        exam.setSingleChoice(questionDao.getQuestionsWithTypeAndNum("singleChoice", examContext.getSingleChoice(),occupation));
        exam.setMultipleChoice(questionDao.getQuestionsWithTypeAndNum("multipleChoice", examContext.getMultipleChoice(),occupation));
        exam.setJudge(questionDao.getQuestionsWithTypeAndNum("judge", examContext.getJudge(),occupation));
        exam.setCompletion(questionDao.getQuestionsWithTypeAndNum("completion", examContext.getCompletion(),occupation));
        exam.setSimpleQuestion(questionDao.getQuestionsWithTypeAndNum("simpleQuestion", examContext.getSimpleQuestion(),occupation));
        exam.setCode(questionDao.getQuestionsWithTypeAndNum("code", examContext.getCode(),occupation));

        return exam;
    }
}
