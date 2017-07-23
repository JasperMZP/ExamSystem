package com.bjtu.examsys.exception;

/**
 * Created by Jasper on 2017/7/23.
 */
public class SignException extends RuntimeException{

    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public SignException(Integer code, String message){
        super(message);
        this.code=code;
    }
}
