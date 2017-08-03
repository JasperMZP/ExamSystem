package com.bjtu.examsys.controller;

import com.bjtu.examsys.aspect.HttpAspect;
import com.bjtu.examsys.domain.Result;
import com.bjtu.examsys.domain.ReturnUser;
import com.bjtu.examsys.domain.User;
import com.bjtu.examsys.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by Jasper on 2017/7/23.
 */
@RestController
public class UserController {

    private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);

    @Autowired
    private UserService userService;

    /*@PutMapping(value = "/examsys/hello")
    public String test(@RequestParam("aaa") String aaa) {
        return "Hello World! "+aaa;
    }*/
/*
    @PostMapping("/examsys/pojo")
    public Result<User> test2(@Valid User user, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return ResultUtil.error(1,bindingResult.getFieldError().getDefaultMessage());
        }
        logger.info(user.toString());
        return ResultUtil.success(user);
    }

    //@RequestMapping(value = "/examsys/test", method = RequestMethod.GET)
    @GetMapping(value = "/examsys/user/{id}")
    public User findOneUserByUserId(@PathVariable("id") String userId) {
        logger.info("findOneUserByUserId");
        return userService.findUserByUserId(userId);
    }*/

    @PostMapping(value = "/examsys/user/register")
    public Result userRegister(@Valid User user, BindingResult bindingResult) throws Exception {
        return userService.userRegister(user, bindingResult);
    }

    @PostMapping(value = "/examsys/user/login")
    public Result<ReturnUser> userLogin(@RequestParam("userId") String userId, @RequestParam("password") String password) throws Exception {
        return userService.userLogin(userId, password);
    }

    @PutMapping(value = "/examsys/user/{userId}")
    public Result userUpdate(@PathVariable("userId") String userId,@RequestParam("occupation")
            String occupation,@RequestParam("gender")String gender)throws Exception{
        logger.info(userId);
        return userService.userUpdate(userId,occupation,gender);
    }
}
