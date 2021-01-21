package com.github.lab.config;

import com.google.common.util.concurrent.RateLimiter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.concurrent.TimeUnit;

/**
 * @author zhaojiejun
 * @date 2021/1/21 9:17 下午
 **/
@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {
    @Autowired
    private RateLimiterInterceptor rateLimiterInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        /**
         * test接口，1秒钟生成1个令牌，也就是1秒中允许一个人访问
         */
        registry.addInterceptor(rateLimiterInterceptor)
                .addPathPatterns("/test/**");
    }
}
