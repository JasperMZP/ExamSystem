package com.bjtu.examsys.service.impl;

public enum ExamType {

    SHOTEXAM(6, 1, 1, 1, 1, 1, 1), MIDDLEEXAM(10,2, 2, 2, 2, 1, 1), LONGEXAM(12,3, 3, 2, 2, 2, 2);

    private int totalNum;
    private int singleChoiceNum;
    private int multipleChoiceNum;
    private int judgeNum;
    private int completionNum;
    private int simpleQuestionNum;
    private int codeNum;

    ExamType(int totalNum, int singleChoiceNum, int multipleChoiceNum, int judgeNum, int completionNum, int simpleQuestionNum, int codeNum) {
        this.totalNum = totalNum;
        this.singleChoiceNum = singleChoiceNum;
        this.multipleChoiceNum = multipleChoiceNum;
        this.judgeNum = judgeNum;
        this.completionNum = completionNum;
        this.simpleQuestionNum = simpleQuestionNum;
        this.codeNum = codeNum;
    }

    public int getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(int totalNum) {
        this.totalNum = totalNum;
    }

    public int getSingleChoiceNum() {
        return singleChoiceNum;
    }

    public void setSingleChoiceNum(int singleChoiceNum) {
        this.singleChoiceNum = singleChoiceNum;
    }

    public int getMultipleChoiceNum() {
        return multipleChoiceNum;
    }

    public void setMultipleChoiceNum(int multipleChoiceNum) {
        this.multipleChoiceNum = multipleChoiceNum;
    }

    public int getJudgeNum() {
        return judgeNum;
    }

    public void setJudgeNum(int judgeNum) {
        this.judgeNum = judgeNum;
    }

    public int getCompletionNum() {
        return completionNum;
    }

    public void setCompletionNum(int completionNum) {
        this.completionNum = completionNum;
    }

    public int getSimpleQuestionNum() {
        return simpleQuestionNum;
    }

    public void setSimpleQuestionNum(int simpleQuestionNum) {
        this.simpleQuestionNum = simpleQuestionNum;
    }

    public int getCodeNum() {
        return codeNum;
    }

    public void setCodeNum(int codeNum) {
        this.codeNum = codeNum;
    }
}
