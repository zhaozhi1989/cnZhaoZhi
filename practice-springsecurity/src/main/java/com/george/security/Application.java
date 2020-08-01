package com.george.security;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhaozhi
 * @description
 * @since 2020/8/1
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.george.security.mapper"}) //扫描Mapper
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
