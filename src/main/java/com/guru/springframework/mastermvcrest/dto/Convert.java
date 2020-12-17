package com.guru.springframework.mastermvcrest.dto;


import com.guru.springframework.mastermvcrest.domain.Category;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Convert {

    @Autowired
    ModelMapper modelMapper;
    public CategoryDTO convertToDto(Category category) {
        CategoryDTO postDto = modelMapper.map(category, CategoryDTO.class);

        return postDto;
    }
}
