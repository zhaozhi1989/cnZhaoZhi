package com.george.sharding.entity;

import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @author zhaozhi
 * @description
 * @since 2020/7/31
 */
@TableName(value = "orders")
public class OrderDO {

    /**
     * 订单编号
     */
    private Long id;
    /**
     * 用户编号
     */
    private Integer userId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
