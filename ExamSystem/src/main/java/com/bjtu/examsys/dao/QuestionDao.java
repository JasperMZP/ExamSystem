package com.bjtu.examsys.dao;

import com.bjtu.examsys.domain.Question;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Wjl on 2017/7/29.
 */
public interface QuestionDao {

    Question findQuestionByQuestionId(@Param("questionId") Integer questionId);

    Integer addQuestions(@Param("question") Question question);

    List<Question> getAllQuestions();

    Integer deleteQuestionByIds(@Param("ids") List<Integer> ids);
}
