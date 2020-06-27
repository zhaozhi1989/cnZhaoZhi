package com.george.minus.service.impl;

import com.george.api.exception.MinusException;
import com.george.api.service.MinusService;

/**
 * @author zhaozhi
 * @description 减法服务实现，不支持负数
 * @since 2020/6/20
 */
public class MinusServiceNotSupportNegativeImpl implements MinusService {

    /**
     * 减法运算，不支持负数结果，如果减数小于被减数，则抛出MinusException
     *
     * @param minuend     减数
     * @param subtraction 被减数
     * @return
     * @throws MinusException
     */
    @Override
    public int minus(int minuend, int subtraction) throws MinusException {
        if (subtraction > minuend) {
            throw new MinusException("不支持结果负数");
        }
        return minuend - subtraction;
    }
}
