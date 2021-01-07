package com.github.lab.dal;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author zhaojiejun
 * @date 2021/1/7 8:25 下午
 **/
@Data
@TableName("user")
public class UserDO {
    /**
     * 主键id
     */
    private Long id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 邮箱
     */
    private String email;
}
