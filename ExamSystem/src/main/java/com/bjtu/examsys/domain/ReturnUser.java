package com.bjtu.examsys.domain;

/**
 * Created by Jasper on 2017/7/24.
 */
public class ReturnUser {
    private String userId;

    private String[] occupation;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String[] getOccupation() {
        return occupation;
    }

    public void setOccupation(String[] occupation) {
        this.occupation = occupation;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    private String gender;
}
