package com.george.security.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.george.security.entity.SysMenuEntity;
import com.george.security.entity.SysRoleEntity;
import com.george.security.entity.SysUserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 系统用户Mapper
 *
 * @author zhaozhi
 * @description
 * @since 2020/8/1
 */
@Mapper
public interface SysUserMapper extends BaseMapper<SysUserEntity> {

    /**
     * 通过用户ID查询角色集合
     *
     * @Param userId 用户ID
     * @Return List<SysRoleEntity> 角色名集合
     */
    List<SysRoleEntity> selectSysRoleByUserId(Long userId);

    /**
     * 通过用户ID查询权限集合
     *
     * @Param userId 用户ID
     * @Return List<SysMenuEntity> 角色名集合
     */
    List<SysMenuEntity> selectSysMenuByUserId(Long userId);
}
