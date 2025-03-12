package com.mszlu.blog.vo.params;

import lombok.Data;

/**
 * @author yanzhiyu
 * @date 2025/3/12
 */
@Data
public class LoginParam {

    private String account;

    private String password;

    private String nickname;
}
