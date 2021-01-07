package com.github.lab;

import com.github.lab.common.ModelConvector;
import com.github.lab.dal.UserDO;
import com.github.lab.mapper.UserMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author zhaojiejun
 * @date 2021/1/7 8:45 下午
 **/
public class UserTest extends LabApplicationTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    @DisplayName("测试h2数据库捞数据")
    void selectListTest() {
        List<UserDO> userList = userMapper.selectList(null);
        userList.stream().map(ModelConvector.INSTANCE::convert).forEach(System.out::println);
    }
}
