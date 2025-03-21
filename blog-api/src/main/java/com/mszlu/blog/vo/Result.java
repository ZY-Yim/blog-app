package com.mszlu.blog.vo;

import com.mszlu.blog.dao.pojo.Article;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {

    private boolean success;

    private Integer code;

    private String msg;

    private Object data;


    public static Result success(Object data) {
        return new Result(true,200,"success",data);
    }

    public static Result fail(int code, String msg) {
        return new Result(false,code,msg,null);
    }
}