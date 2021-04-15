package com.github.lab.controller;

import com.github.lab.dto.ResultDTO;
import com.github.lab.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaojiejun
 * @date 2021/4/14 9:59 下午
 **/
@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private ITestService iTestService;

    @GetMapping("/01")
    public ResultDTO<String> search() {
        return iTestService.search();
    }
}
