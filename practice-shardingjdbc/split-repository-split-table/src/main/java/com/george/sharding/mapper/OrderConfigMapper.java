package com.george.sharding.mapper;

import com.george.sharding.entity.OrderConfigDO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author zhaozhi
 * @description
 * @since 2020/7/30
 */
@Repository
public interface OrderConfigMapper {

    OrderConfigDO selectById(@Param("id") Integer id);

}
