package com.george.sharding.mapper;

import com.george.sharding.entity.OrderDO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 订单映射类
 *
 * @author zhaozhi
 * @description
 * @since 2020/7/30
 */
@Repository
public interface OrderMapper {

    OrderDO selectById(@Param("id") Integer id);

    List<OrderDO> selectListByUserId(@Param("userId") Integer userId);

    void insert(OrderDO order);

}
