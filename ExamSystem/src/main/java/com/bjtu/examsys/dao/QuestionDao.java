package com.bjtu.examsys.dao;

import com.bjtu.examsys.domain.Question;
import org.apache.ibatis.annotations.Param;
/**
 * Created by Wjl on 2017/7/29.
 */
public interface QuestionDao {
    Question findQuestionByQuestionId(@Param("questionId") Integer questionId);
}
