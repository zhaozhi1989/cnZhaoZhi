package com.george.api.service;

import com.george.api.exception.MinusException;

/**
 * @author zhaozhi
 * @description 减法服务接口
 * @since 2020/6/20
 */
public interface MinusService {

    /**
     * 普通减法
     *
     * @param minuend     减数
     * @param subtraction 被减数
     * @return
     */
    int minus(int minuend, int subtraction) throws MinusException;
}
