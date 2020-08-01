package com.george.security.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.george.security.entity.SysRoleEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 角色Mapper
 *
 * @author zhaozhi
 * @description
 * @since 2020/8/1
 */
@Mapper
public interface SysRoleMapper extends BaseMapper<SysRoleEntity> {
}
