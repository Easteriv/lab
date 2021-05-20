package com.github.lab.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.lab.dal.UserDO;
import org.mapstruct.Mapper;

/**
 * @author zhaojiejun
 * @date 2021/5/21 12:09 上午
 **/
@Mapper
public interface UserMapper extends BaseMapper<UserDO> {
}
