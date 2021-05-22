package com.github.lab;

import com.github.lab.dal.UserDO;
import com.github.lab.mapper.UserMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhaojiejun
 */
@SpringBootApplication
@MapperScan("com.github.lab.mapper")
public class LabApplication implements CommandLineRunner {

    @Autowired
    private UserMapper userMapper;

    public static void main(String[] args) {
        SpringApplication.run(LabApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        UserDO userDO = UserDO.builder().userName("zxm").passWord("123").fullName("朱小明").build();
        userMapper.insert(userDO);
        System.out.println("初始化完毕");
    }
}
