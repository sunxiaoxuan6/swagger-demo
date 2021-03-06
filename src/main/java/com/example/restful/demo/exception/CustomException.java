package com.example.restful.demo.exception;

import com.example.restful.demo.common.ExceptionType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class CustomException extends RuntimeException{
//    错误代码
    protected Integer code;
//    错误信息
    protected String message;

    public CustomException(ExceptionType type){
        this.code=type.getCode();
        this.message=type.getMsg();
    }
}
