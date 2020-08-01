package com.george.security.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.george.security.entity.SysRoleMenuEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 角色权限关系Mapper
 *
 * @author zhaozhi
 * @description
 * @since 2020/8/1
 */
@Mapper
public interface SysRoleMenuMapper extends BaseMapper<SysRoleMenuEntity> {
}
