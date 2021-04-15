package com.github.lab.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zhaojiejun
 * @date 2020/8/23 7:40 下午
 **/

@ControllerAdvice
@Slf4j
public class GlobalDefaultExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public void defaultExceptionHandler(HttpServletRequest request, Exception e) {
        log.error("biz exception：{}", e.getMessage());
        //发送通知邮件
        // System.out.println("发送通知邮件");
        System.out.println("捕捉到了异常啦");
    }
}
