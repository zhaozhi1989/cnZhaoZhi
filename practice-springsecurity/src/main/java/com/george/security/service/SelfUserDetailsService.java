package com.george.security.service;

import com.george.security.entity.SelfUserEntity;
import com.george.security.entity.SysUserEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/**
 * SpringSecurity用户的业务实现
 *
 * @author zhaozhi
 * @description
 * @since 2020/8/1
 */
@Component
public class SelfUserDetailsService implements UserDetailsService {

    @Autowired
    private SysUserService sysUserService;

    /**
     * 查询用户信息
     *
     * @Param username  用户名
     * @Return UserDetails SpringSecurity用户信息
     */
    @Override
    public SelfUserEntity loadUserByUsername(String username) throws UsernameNotFoundException {
        // 查询用户信息
        SysUserEntity sysUserEntity = sysUserService.selectUserByName(username);
        if (sysUserEntity != null) {
            // 组装参数
            SelfUserEntity selfUserEntity = new SelfUserEntity();
            BeanUtils.copyProperties(sysUserEntity, selfUserEntity);
            return selfUserEntity;
        }
        return null;
    }
}
