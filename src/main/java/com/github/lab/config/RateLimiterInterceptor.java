package com.github.lab.config;

import com.google.common.util.concurrent.RateLimiter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhaojiejun
 * @date 2021/1/21 9:15 下午
 **/
@Component
public class RateLimiterInterceptor implements HandlerInterceptor {

    @Autowired
   private RateLimiter rateLimiter;





    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        if(rateLimiter.tryAcquire()) {
            /**
             * 成功获取到令牌
             */
            return true;
        }

        /**
         * 获取失败，直接响应“错误信息”
         * 也可以通过抛出异常，通过全全局异常处理器响应客户端
         */
        response.setCharacterEncoding(StandardCharsets.UTF_8.name());
        response.setContentType(MediaType.APPLICATION_JSON_VALUE);
        Map<String, Object> map = new HashMap<>();
        map.put("success", Boolean.FALSE);
        map.put("code","0000");
        map.put("msg","服务器繁忙");
        response.getWriter().write(map.toString());
        return false;
    }
}
