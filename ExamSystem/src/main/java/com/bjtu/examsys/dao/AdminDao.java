package com.bjtu.examsys.dao;

import com.bjtu.examsys.domain.Admin;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Jasper on 2017/7/23.
 */
public interface AdminDao {

    Admin findAdminByUserId(@Param("adminId") String adminId);

}
