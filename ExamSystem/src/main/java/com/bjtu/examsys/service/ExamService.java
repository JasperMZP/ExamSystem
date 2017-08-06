package com.bjtu.examsys.service;
import com.bjtu.examsys.domain.Exam;
import com.bjtu.examsys.domain.Result;

public interface ExamService {
    Result addExam(String userId,String occupation,String testScore,String time,String type,String score,String difficulty,String content,String answer,String examAnswer,String analysis,String result) throws  Exception;
}
