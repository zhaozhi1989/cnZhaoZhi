package com.george.cache.util;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * json解析器
 * @author zhaozhi
 * @description
 * @since 2020/6/24
 */
public class JsonUtil {

    private static volatile ObjectMapper mapper;

    public static ObjectMapper getMapper() {
        if (mapper == null) {
            synchronized (ObjectMapper.class) {
                if (mapper == null) {
                    mapper = new ObjectMapper();
                }
            }
        }
        return mapper;
    }
}
