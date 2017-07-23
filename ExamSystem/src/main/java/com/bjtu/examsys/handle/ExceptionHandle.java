package com.bjtu.examsys.handle;

import com.bjtu.examsys.domain.Result;
import com.bjtu.examsys.exception.SignException;
import com.bjtu.examsys.utils.ResultUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Jasper on 2017/7/23.
 */
@ControllerAdvice
public class ExceptionHandle {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e){
        if (e instanceof SignException){
            SignException signException = (SignException) e;
            return ResultUtil.error(signException.getCode(), signException.getMessage());
        }
        return ResultUtil.error(-1,"未知错误");
    }
}
