package com.george.sharding.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.george.sharding.entity.OrderDO;
import org.springframework.stereotype.Repository;

/**
 * @author zhaozhi
 * @description
 * @since 2020/7/31
 */
@Repository
public interface OrderMapper extends BaseMapper<OrderDO> {

}
