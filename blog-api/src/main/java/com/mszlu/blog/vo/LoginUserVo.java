package com.mszlu.blog.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author yanzhiyu
 * @date 2025/3/12
 */
@Getter
@Setter
public class LoginUserVo {
    private Long id;

    private String account;

    private String nickname;

    private String avatar;
}
