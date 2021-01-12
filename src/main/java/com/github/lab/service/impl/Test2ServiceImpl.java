package com.github.lab.service.impl;

import com.github.lab.service.ITest2Service;
import org.springframework.stereotype.Service;

/**
 * @author zhaojiejun
 * @date 2021/1/9 9:11 下午
 **/
@Service
public class Test2ServiceImpl implements ITest2Service {
    @Override
    public void say() {
        System.out.println("test2执行了");
    }
}
