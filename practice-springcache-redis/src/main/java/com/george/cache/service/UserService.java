package com.george.cache.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.george.cache.config.RedisConfig;
import com.george.cache.pojo.User;
import com.george.cache.util.JsonUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhaozhi
 * @description
 * @since 2020/6/24
 */
@Service
@Slf4j
public class UserService {

    @Autowired
    private RedisTemplate redisTemplate;

    private Map<String, User> users = new HashMap<>();

    public boolean createUser(User user) throws JsonProcessingException {
        log.info("用户创建成功[{}]", JsonUtil.getMapper().writeValueAsString(user));
        users.put(user.getName(), user);
        List<String> keys = new ArrayList<>();
        keys.add(RedisConfig.CACHE_PREFIX + user.getName());
        keys.add(RedisConfig.CACHE_PREFIX + "f:" + user.getName());
        keys.add(RedisConfig.CACHE_PREFIX + user.getId());
        Long deleteNum = redisTemplate.delete(keys);
        log.info("删除了{}个缓存", deleteNum);
        return true;
    }

    @Cacheable(value = "5d", key = "#name")
    public User findUser(String name) {
        User user = users.get(name);
        if (user != null) {
            return user;
        }
        log.warn("未找到联系人！");
        return null;
    }

    @Cacheable(value = "3d", key = "'f:'+#name")
    public Integer findUserId(String name) {
        User user = users.get(name);
        if (user != null) {
            return user.getId();
        }
        log.warn("未找到用户id！");
        return -1;
    }

    @Cacheable(value = "3d", key = "#id")
    public String findUserName(Integer id) {
        for (Map.Entry<String, User> entry : users.entrySet()) {
            User user = entry.getValue();
            if (user.getId().equals(id)) {
                return user.getName();
            }
        }
        return "未找到联系人！";
    }

}
