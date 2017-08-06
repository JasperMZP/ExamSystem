package com.bjtu.examsys.domain;

public class ExamContext {
    private int questionNum;
    private int singleChoice;
    private int multipleChoice;
    private int judge;
    private int code;
    private int completion;
    private int simpleQuestion;

    public int getCompletion() {
        return completion;
    }

    public void setCompletion(int completion) {
        this.completion = completion;
    }

    public int getSimpleQuestion() {
        return simpleQuestion;
    }

    public void setSimpleQuestion(int simpleQuestion) {
        this.simpleQuestion = simpleQuestion;
    }

    public int getQuestionNum() {
        return questionNum;
    }

    public void setQuestionNum(int questionNum) {
        this.questionNum = questionNum;
    }

    public int getSingleChoice() {
        return singleChoice;
    }

    public void setSingleChoice(int singleChoice) {
        this.singleChoice = singleChoice;
    }

    public int getMultipleChoice() {
        return multipleChoice;
    }

    public void setMultipleChoice(int multipleChoice) {
        this.multipleChoice = multipleChoice;
    }

    public int getJudge() {
        return judge;
    }

    public void setJudge(int judge) {
        this.judge = judge;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
