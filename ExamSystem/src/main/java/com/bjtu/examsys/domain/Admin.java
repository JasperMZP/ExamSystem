package com.bjtu.examsys.domain;

/**
 * Created by Jasper on 2017/7/24.
 */
public class Admin {
    private String adminId;
    private String password;
    private String gender;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
