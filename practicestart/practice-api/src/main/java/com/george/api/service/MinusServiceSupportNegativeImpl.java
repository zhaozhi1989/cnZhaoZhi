package com.george.api.service;

import com.george.api.exception.MinusException;

/**
 * @author zhaozhi
 * @description
 * @since 2020/6/20
 */
public class MinusServiceSupportNegativeImpl implements MinusService {

    /**
     * 减法实现，支持返回结果为负数
     *
     * @param minuend     减数
     * @param subtraction 被减数
     * @return
     * @throws MinusException
     */
    @Override
    public int minus(int minuend, int subtraction) throws MinusException {
        return minuend - subtraction;
    }
}
