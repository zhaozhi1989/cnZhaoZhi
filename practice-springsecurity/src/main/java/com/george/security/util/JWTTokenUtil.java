package com.george.security.util;

import com.alibaba.fastjson.JSON;
import com.george.security.config.JWTConfig;
import com.george.security.entity.SelfUserEntity;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

/**
 * JWT工具类
 *
 * @author zhaozhi
 * @description
 * @since 2020/8/1
 */
@Slf4j
public class JWTTokenUtil {

    /**
     * 生成Token
     * @Author Sans
     * @CreateTime 2019/10/2 12:16
     * @Param  selfUserEntity 用户安全实体
     * @Return Token
     */
    public static String createAccessToken(SelfUserEntity selfUserEntity){
        // 登陆成功生成JWT
        String token = Jwts.builder()
                // 放入用户名和用户ID
                .setId(selfUserEntity.getUserId()+"")
                // 主题
                .setSubject(selfUserEntity.getUsername())
                // 签发时间
                .setIssuedAt(new Date())
                // 签发者
                .setIssuer("george")
                // 自定义属性 放入用户拥有权限
                .claim("authorities", JSON.toJSONString(selfUserEntity.getAuthorities()))
                // 失效时间
                .setExpiration(new Date(System.currentTimeMillis() + JWTConfig.expiration))
                // 签名算法和密钥
                .signWith(SignatureAlgorithm.HS512, JWTConfig.secret)
                .compact();
        return token;
    }
}
