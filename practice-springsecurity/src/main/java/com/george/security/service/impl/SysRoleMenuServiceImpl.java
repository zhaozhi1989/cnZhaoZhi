package com.george.security.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.george.security.entity.SysRoleMenuEntity;
import com.george.security.mapper.SysRoleMenuMapper;
import com.george.security.service.SysRoleMenuService;
import org.springframework.stereotype.Service;

/**
 * 角色与权限业务实现
 *
 * @author zhaozhi
 * @description
 * @since 2020/8/1
 */
@Service("sysRoleMenuService")
public class SysRoleMenuServiceImpl extends ServiceImpl<SysRoleMenuMapper, SysRoleMenuEntity> implements SysRoleMenuService {

}
