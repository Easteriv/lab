package com.github.lab.service.impl;

import com.github.lab.dto.ResultDTO;
import com.github.lab.service.ITestService;
import org.springframework.stereotype.Service;

/**
 * @author zhaojiejun
 * @date 2021/4/14 10:01 下午
 **/
@Service
public class TestServiceImpl implements ITestService {
    @Override
    public ResultDTO<String> search() {
        return ResultDTO.success("hello");
    }
}
