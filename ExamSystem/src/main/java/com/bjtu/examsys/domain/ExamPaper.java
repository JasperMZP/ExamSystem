package com.bjtu.examsys.domain;

import java.util.List;

public class ExamPaper {
    private ExamContext context;
    private List<Question> singleChoice;
    private List<Question> multipleChoice;
    private List<Question> judge;
    private List<Question> completion;
    private List<Question> simpleQuestion;
    private List<Question> code;

    public ExamContext getContext() {
        return context;
    }

    public void setContext(ExamContext context) {
        this.context = context;
    }

    public List<Question> getSingleChoice() {
        return singleChoice;
    }

    public void setSingleChoice(List<Question> singleChoice) {
        this.singleChoice = singleChoice;
    }

    public List<Question> getMultipleChoice() {
        return multipleChoice;
    }

    public void setMultipleChoice(List<Question> multipleChoice) {
        this.multipleChoice = multipleChoice;
    }

    public List<Question> getJudge() {
        return judge;
    }

    public void setJudge(List<Question> judge) {
        this.judge = judge;
    }

    public List<Question> getCompletion() {
        return completion;
    }

    public void setCompletion(List<Question> completion) {
        this.completion = completion;
    }

    public List<Question> getSimpleQuestion() {
        return simpleQuestion;
    }

    public void setSimpleQuestion(List<Question> simpleQuestion) {
        this.simpleQuestion = simpleQuestion;
    }

    public List<Question> getCode() {
        return code;
    }

    public void setCode(List<Question> code) {
        this.code = code;
    }
}
