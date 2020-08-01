package com.george.security.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.george.security.entity.SysRoleEntity;
import com.george.security.mapper.SysRoleMapper;
import com.george.security.service.SysRoleService;
import org.springframework.stereotype.Service;

/**
 * 角色业务实现
 *
 * @author zhaozhi
 * @description
 * @since 2020/8/1
 */
@Service("sysRoleService")
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRoleEntity> implements SysRoleService {

}
