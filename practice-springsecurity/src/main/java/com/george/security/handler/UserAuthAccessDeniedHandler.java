package com.george.security.handler;

import com.george.security.util.ResultUtil;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 暂无权限处理类
 *
 * @author zhaozhi
 * @description
 * @since 2020/8/1
 */
@Component
public class UserAuthAccessDeniedHandler implements AccessDeniedHandler {

    /**
     * 暂无权限返回结果
     */
    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException exception) {
        ResultUtil.responseJson(response, ResultUtil.resultCode(403, "未授权"));
    }
}
