package com.george.cache.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.george.cache.pojo.User;
import com.george.cache.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhaozhi
 * @description
 * @since 2020/6/24
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    /**
     * 创建用户
     *
     * @param user
     * @return
     * @throws JsonProcessingException
     */
    @PostMapping("/v1/user")
    public Object createUser(@RequestBody User user) throws JsonProcessingException {
        boolean flag = userService.createUser(user);
        if (flag) {
            return "用户创建成功";
        }
        return "用户创建失败";
    }

    /**
     * 根据名称查询用户
     *
     * @param name
     * @return
     */
    @GetMapping("/v1/user/{name}")
    public User findUser(@PathVariable("name") String name) {
        return userService.findUser(name);
    }

    /**
     * 根据名称查询用户id
     *
     * @param name
     * @return
     */
    @GetMapping("/v1/uid/{name}")
    public Object findUserId(@PathVariable("name") String name) {
        return userService.findUserId(name);
    }

    /**
     * 根据id查询用户名称
     *
     * @param id
     * @return
     */
    @GetMapping("/v1/name/{id}")
    public Object findUserName(@PathVariable("id") Integer id) {
        return userService.findUserName(id);
    }

}
