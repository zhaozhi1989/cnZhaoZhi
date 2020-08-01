package com.george.security.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.george.security.entity.SysUserRoleEntity;
import com.george.security.mapper.SysUserRoleMapper;
import com.george.security.service.SysUserRoleService;
import org.springframework.stereotype.Service;

/**
 * 用户与角色业务实现
 *
 * @author zhaozhi
 * @description
 * @since 2020/8/1
 */
@Service("sysUserRoleService")
public class SysUserRoleServiceImpl extends ServiceImpl<SysUserRoleMapper, SysUserRoleEntity> implements SysUserRoleService {

}
