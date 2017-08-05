package com.bjtu.examsys.service.impl;

import com.bjtu.examsys.dao.AdminDao;
import com.bjtu.examsys.domain.Admin;
import com.bjtu.examsys.domain.Result;
import com.bjtu.examsys.exception.SignException;
import com.bjtu.examsys.service.AdminService;
import com.bjtu.examsys.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Jasper on 2017/7/24.
 */
@Service
public class AdminServiceImpl implements AdminService{

    @Autowired
    private AdminDao adminDao;

    @Override
    public Result<Admin> adminLogin(String adminId, String password) throws Exception {
        //User loginUser = userDao.findUserByUserId(userId);
        Admin loginAdmin = adminDao.findAdminByUserId(adminId);
        if (loginAdmin != null) {
            if (loginAdmin.getPassword().equals(password)) {
                return ResultUtil.success(loginAdmin);
            }
        }
        throw new SignException(3, "管理员Id或密码不对");
    }
}
