package com.github.lab.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author zhaojiejun
 * @date 2021/2/10 1:17 下午
 **/
@Component
public class WeatherSchedule {

    @Scheduled(cron = "")
    public void sendWeather() {

    }
}
