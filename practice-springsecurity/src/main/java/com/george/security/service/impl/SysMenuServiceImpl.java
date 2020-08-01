package com.george.security.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.george.security.entity.SysMenuEntity;
import com.george.security.mapper.SysMenuMapper;
import com.george.security.service.SysMenuService;
import org.springframework.stereotype.Service;

/**
 * 权限业务实现
 *
 * @author zhaozhi
 * @description
 * @since 2020/8/1
 */
@Service("sysMenuService")
public class SysMenuServiceImpl extends ServiceImpl<SysMenuMapper, SysMenuEntity> implements SysMenuService {

}
