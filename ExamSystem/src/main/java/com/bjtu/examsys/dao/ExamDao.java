package com.bjtu.examsys.dao;
import com.bjtu.examsys.domain.Exam;
import org.apache.ibatis.annotations.Param;

public interface ExamDao {
    Integer addExam(@Param("exam") Exam exam);
    Exam getTestPaper(@Param("testPaperId") String testPaperId);

}
