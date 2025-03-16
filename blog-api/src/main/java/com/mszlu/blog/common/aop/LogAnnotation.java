package com.mszlu.blog.common.aop;

import java.lang.annotation.*;

/**
 * 日志注解
 *
 * @author yanzhiyu
 * @date 2025/3/15
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LogAnnotation {

    String module() default "";

    String operation() default "";
}

