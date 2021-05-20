package com.github.lab.common;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author zhaojiejun
 * @date 2020/9/4 8:46 下午
 **/
@Mapper
public interface ModelConvector {

    ModelConvector INSTANCE = Mappers.getMapper(ModelConvector.class);


}
