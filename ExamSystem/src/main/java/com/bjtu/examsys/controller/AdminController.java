package com.bjtu.examsys.controller;

import com.bjtu.examsys.aspect.HttpAspect;
import com.bjtu.examsys.domain.Admin;
import com.bjtu.examsys.domain.Result;
import com.bjtu.examsys.domain.User;
import com.bjtu.examsys.service.AdminService;
import com.bjtu.examsys.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Created by Jasper on 2017/7/23.
 */
@RestController
public class AdminController {

    private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);

    @Autowired
    private AdminService adminService;

    @PostMapping(value = "/examsys/admin/login")
    public Result<Admin> adminLogin(@RequestParam("adminId") String adminId, @RequestParam("password") String password) throws Exception {
        return adminService.adminLogin(adminId, password);
    }

}
