/*
 * Copyright (c) 2015. 上海趣医网络科技有限公司 版权所有
 * Shanghai QuYi Network Technology Co., Ltd. All Rights Reserved.
 *
 * This is NOT a freeware,use is subject to license terms.
 */

package com.tg8.interceptor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 允许跨域.
 *
 * @author penny
 * @version 1.0, 2016-06-06
 * @since 1.0
 */
@SuppressWarnings({ "unused", "WeakerAccess" })
@Component
public class SimpleCORSFilter implements Filter {

    @Value("${spring.profiles.active}")
    private String env;
    /**
     * 初始化
     *
     * @param filterConfig
     * @throws ServletException
     */
    @Override
    public void init(final FilterConfig filterConfig) throws ServletException {
        // left blank intentionally
    }

    /**
     * 过滤
     *
     * @param req
     * @param res
     * @param filterChain
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doFilter(final ServletRequest req, final ServletResponse res, final FilterChain filterChain)
            throws IOException, ServletException {
        final HttpServletResponse response = (HttpServletResponse) res;
        final HttpServletRequest request = (HttpServletRequest) req;

        if ("dev".equals(env) || "local".equals(env)) {
            response.setHeader("Access-Control-Allow-Origin", "*");
            response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE, PUT");
            response.setHeader("Access-Control-Max-Age", "3600");
            response.setHeader("Access-Control-Allow-Headers", "x-requested-with,accept,Content-Type");
            response.setHeader("Access-Control-Allow-Headers", "x-requested-with,accept,Content-Type,authorization");
        }
        filterChain.doFilter(req, res);
    }

    @Override
    public void destroy() {
        // left blank intentionally
    }
}