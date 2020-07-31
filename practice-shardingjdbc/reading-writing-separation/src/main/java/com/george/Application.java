package com.george;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 读写分离主类
 *
 * @author zhaozhi
 * @description
 * @since 2020/7/30
 */
@SpringBootApplication
@MapperScan("com.george.sharding.mapper")
public class Application {

//    public static void main(String[] args) {
//        SpringApplication.run(Application.class, args);
//    }
}
