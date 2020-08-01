package com.george.security.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 权限实体
 *
 * @author zhaozhi
 * @description
 * @since 2020/8/1
 */
@Data
@TableName("sys_menu")
public class SysMenuEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 权限ID
     */
    @TableId
    private Long menuId;
    /**
     * 权限名称
     */
    private String menuName;
    /**
     * 权限标识
     */
    private String permission;

}
