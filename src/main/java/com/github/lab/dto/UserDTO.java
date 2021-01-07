package com.github.lab.dto;

import lombok.Data;

/**
 * @author zhaojiejun
 * @date 2021/1/7 8:56 下午
 **/
@Data
public class UserDTO {
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
