package com.mszlu.blog.controller;

import com.mszlu.blog.vo.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yanzhiyu
 * @date 2025/3/12
 */
@RestController
@RequestMapping("test")
public class TestController {
    @RequestMapping
    public Result test(){
        return Result.success(null);
    }
}
