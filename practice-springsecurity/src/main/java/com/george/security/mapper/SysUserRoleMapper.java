package com.george.security.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.george.security.entity.SysUserRoleEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户与角色关系Mapper
 *
 * @author zhaozhi
 * @description
 * @since 2020/8/1
 */
@Mapper
public interface SysUserRoleMapper extends BaseMapper<SysUserRoleEntity> {
}
