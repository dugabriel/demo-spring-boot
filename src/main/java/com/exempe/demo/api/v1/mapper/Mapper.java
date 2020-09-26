package com.exempe.demo.api.v1.mapper;

import org.modelmapper.ModelMapper;

public abstract class Mapper {

    private static final ModelMapper modelMapper = new ModelMapper();

    public static <T> T map(Object obj, Class<T> clazz) {
        return modelMapper.map(obj, clazz);
    }
}
