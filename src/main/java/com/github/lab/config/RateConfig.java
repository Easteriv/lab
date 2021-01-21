package com.github.lab.config;

import com.google.common.util.concurrent.RateLimiter;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @author zhaojiejun
 * @date 2021/1/21 9:27 下午
 **/
@Component
public class RateConfig {
    @Bean
    public RateLimiter init(){
        return RateLimiter.create(1, 5, TimeUnit.SECONDS);
    }
}
