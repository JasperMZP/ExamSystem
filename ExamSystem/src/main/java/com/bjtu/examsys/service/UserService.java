package com.bjtu.examsys.service;

import com.bjtu.examsys.domain.Result;
import com.bjtu.examsys.domain.ReturnUser;
import com.bjtu.examsys.domain.User;
import org.springframework.validation.BindingResult;

/**
 * Created by Jasper on 2017/7/23.
 */
public interface UserService {

    Result userRegister(User user, BindingResult bindingResult) throws Exception;

    Result<ReturnUser> userLogin(String userId, String password) throws Exception;
}
