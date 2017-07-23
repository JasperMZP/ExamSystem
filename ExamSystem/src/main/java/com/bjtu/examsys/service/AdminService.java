package com.bjtu.examsys.service;

import com.bjtu.examsys.domain.Admin;
import com.bjtu.examsys.domain.Result;
import com.bjtu.examsys.domain.User;
import org.springframework.validation.BindingResult;

/**
 * Created by Jasper on 2017/7/23.
 */
public interface AdminService {

    Result<Admin> adminLogin(String adminId, String password) throws Exception;

}
