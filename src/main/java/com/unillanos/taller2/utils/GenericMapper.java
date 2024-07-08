package com.unillanos.taller2.utils;

import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

public class GenericMapper {

    private final static ModelMapper modelMapper = new ModelMapper();

    public static <T> T map(Object source, Class<T> destinationType) {
        return modelMapper.map(source, destinationType);
    }

    public static void map(Object source, Object destination) {
        modelMapper.map(source, destination);
    }

    public List<?> mapList(List<?> source, Class<?> destinationType) {
        return source.stream()
                .map(item -> modelMapper.map(item, destinationType))
                .toList();
    }

}
