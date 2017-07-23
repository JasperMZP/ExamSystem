package com.bjtu.examsys.dao;

import com.bjtu.examsys.domain.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectKey;
import org.springframework.stereotype.Component;

/**
 * Created by Jasper on 2017/7/23.
 */
public interface UserDao {

    User findUserByUserId(@Param("userId") String userId);

    Integer insertUser(@Param("user") User user);
}
