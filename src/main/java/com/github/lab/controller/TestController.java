package com.github.lab.controller;

import com.github.lab.dal.UserDO;
import com.github.lab.dto.ResultDTO;
import com.github.lab.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhaojiejun
 * @date 2021/5/22 12:49 下午
 **/
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/getAll/{id}")
    public ResultDTO<UserDO> getAll(@PathVariable(value = "id") long id) {
        UserDO userDO = userMapper.getUser(id);
        return ResultDTO.success(userDO);
    }

}
