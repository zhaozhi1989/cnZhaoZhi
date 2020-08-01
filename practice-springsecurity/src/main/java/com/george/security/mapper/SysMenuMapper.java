package com.george.security.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.george.security.entity.SysMenuEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 权限DAO
 *
 * @author zhaozhi
 * @description
 * @since 2020/8/1
 */
@Mapper
public interface SysMenuMapper extends BaseMapper<SysMenuEntity> {
}
