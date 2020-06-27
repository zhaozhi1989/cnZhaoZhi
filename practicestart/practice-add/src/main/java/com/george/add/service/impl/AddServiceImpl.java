package com.george.add.service.impl;

import com.george.api.service.AddService;

/**
 * @author zhaozhi
 * @description 加法服务实现
 * @since 2020/6/20
 */
public class AddServiceImpl implements AddService {

    /**
     * 加法
     *
     * @param a
     * @param b
     * @return
     */
    @Override
    public int add(int a, int b) {
        return a + b;
    }
}
