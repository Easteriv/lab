package com.github.lab.dal;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

/**
 * @author zhaojiejun
 * @date 2021/5/20 11:38 下午
 **/
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Getter
@TableName("dc_user")
public class UserDO extends AbstractDO<UserDO>{

    private static final long serialVersionUID = -6304406578973344070L;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 姓名
     */
    private String fullName;
    /**
     * 密码
     */
    private String passWord;
}
