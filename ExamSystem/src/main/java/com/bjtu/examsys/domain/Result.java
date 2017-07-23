package com.bjtu.examsys.domain;

/**
 * Created by Jasper on 2017/7/23.
 */
public class Result<T> {
    private Integer code;
    private String msg;
    private T Content;

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getContent() {
        return Content;
    }

    public void setContent(T content) {
        Content = content;
    }
}
