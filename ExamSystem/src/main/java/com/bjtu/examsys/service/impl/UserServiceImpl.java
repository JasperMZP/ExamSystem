package com.bjtu.examsys.service.impl;

import com.bjtu.examsys.aspect.HttpAspect;
import com.bjtu.examsys.dao.UserDao;
import com.bjtu.examsys.domain.Result;
import com.bjtu.examsys.domain.ReturnUser;
import com.bjtu.examsys.domain.User;
import com.bjtu.examsys.exception.SignException;
import com.bjtu.examsys.service.UserService;
import com.bjtu.examsys.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

/**
 * Created by Jasper on 2017/7/23.
 */
@Service
public class UserServiceImpl implements UserService {

    private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);

    @Autowired
    private UserDao userDao;

    @Override
    public Result userRegister(User user, BindingResult bindingResult) throws Exception {
        String errorMsg = "user id 已存在";
        if (bindingResult.hasErrors()) {
            errorMsg = bindingResult.getFieldError().getDefaultMessage();
            throw new SignException(1, errorMsg);
        }
        if (userDao.findUserByUserId(user.getUserId()) == null) {
            if (userDao.insertUser(user)==1){
                return ResultUtil.success();
            }

        }
        throw new SignException(1, errorMsg);
    }

    @Override
    public Result<ReturnUser> userLogin(String userId, String password) throws Exception {
        User loginUser = userDao.findUserByUserId(userId);
        if (loginUser != null) {
            if (loginUser.getPassword().equals(password)) {
                ReturnUser returnUser = new ReturnUser();
                returnUser.setUserId(loginUser.getUserId());
                returnUser.setGender(loginUser.getGender());
                returnUser.setOccupation(loginUser.getOccupation().split(","));
                return ResultUtil.success(returnUser);
            }
        }
        throw new SignException(2, "用户名或密码不对");
    }
}
