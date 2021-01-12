package com.github.lab.service.impl;

import com.github.lab.service.ITest2Service;
import com.github.lab.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

/**
 * @author zhaojiejun
 * @date 2021/1/9 9:09 下午
 **/
@Service
public class TestServiceImpl implements ITestService {
    @Autowired
    private ITest2Service iTest2Service;

    @Override
    public void say() {
        iTest2Service.say();
    }
}
