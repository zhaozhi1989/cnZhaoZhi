package com.george.security.util;

import com.george.security.entity.SelfUserEntity;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * Security工具类
 *
 * @author zhaozhi
 * @description
 * @since 2020/8/1
 */
public class SecurityUtil {

    /**
     * 私有化构造器
     */
    private SecurityUtil(){}

    /**
     * 获取当前用户信息
     */
    public static SelfUserEntity getUserInfo(){
        SelfUserEntity userDetails = (SelfUserEntity) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return userDetails;
    }
    /**
     * 获取当前用户ID
     */
    public static Long getUserId(){
        return getUserInfo().getUserId();
    }
    /**
     * 获取当前用户账号
     */
    public static String getUserName(){
        return getUserInfo().getUsername();
    }
}
