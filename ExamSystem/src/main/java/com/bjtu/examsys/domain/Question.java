package com.bjtu.examsys.domain;

/**
 * Created by Wjl on 2017/7/29.
 */
public class Question {
    private int questionId;
    private String time;
    private String score;
    private String questionType;
    private String occupation;
    private String difficulty;
    private String questionContent;
    private String questionAnswer;
    private String questionAnalysis;


    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getQuestionType() {
        return questionType;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }

    public String getQuestionAnswer() {
        return questionAnswer;
    }

    public void setQuestionAnswer(String questionAnswer) {
        this.questionAnswer = questionAnswer;
    }

    public String getQuestionAnalysis() {
        return questionAnalysis;
    }

    public void setQuestionAnalysis(String questionAnalysis) {
        this.questionAnalysis = questionAnalysis;
    }

    @Override
    public String toString() {
        return "Question{" +
                "questionId=" + questionId +
                ", time='" + time + '\'' +
                ", score='" + score + '\'' +
                ", questionType='" + questionType + '\'' +
                ", occupation='" + occupation + '\'' +
                ", difficulty='" + difficulty + '\'' +
                ", questionContent='" + questionContent + '\'' +
                ", questionAnswer='" + questionAnswer + '\'' +
                ", questionAnalysis='" + questionAnalysis + '\'' +
                '}';
    }
}
