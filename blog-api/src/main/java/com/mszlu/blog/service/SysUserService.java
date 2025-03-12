package com.mszlu.blog.service;

import com.mszlu.blog.dao.pojo.SysUser;
import com.mszlu.blog.vo.Result;

/**
 * @author yanzhiyu
 */
public interface SysUserService {

    SysUser findSysUserById(Long userId);

    SysUser findUser(String account, String pwd);

    Result getUserInfoByToken(String token);

    SysUser findUserByAccount(String account);

    void save(SysUser sysUser);
}
