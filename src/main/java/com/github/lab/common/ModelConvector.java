package com.github.lab.common;


import com.github.lab.dal.UserDO;
import com.github.lab.dto.UserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author zhaojiejun
 * @date 2020/9/4 8:46 下午
 **/
@Mapper
public interface ModelConvector {

    ModelConvector INSTANCE = Mappers.getMapper(ModelConvector.class);

    /**
     * DO->DTO
     * @param userDO 数据库模型
     * @return dto模型
     */
    UserDTO convert(UserDO userDO);


}
