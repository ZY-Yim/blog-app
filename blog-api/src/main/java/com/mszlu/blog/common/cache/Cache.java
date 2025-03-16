package com.mszlu.blog.common.cache;

import java.lang.annotation.*;

/**
 * @author yanzhiyu
 * @date 2025/3/16
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Cache {

    long expire() default 60 * 1000;

    // 缓存标识
    String name() default "";

}
