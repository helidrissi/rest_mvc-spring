package com.guru.springframework.mastermvcrest.services;

import com.guru.springframework.mastermvcrest.domain.Category;
import com.guru.springframework.mastermvcrest.dto.CategoryDTO;
import com.guru.springframework.mastermvcrest.repository.CategoryRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    ModelMapper modelMapper;

    public CategoryDTO convertToDto(Category category) {
        CategoryDTO postDto = modelMapper.map(category, CategoryDTO.class);

        return postDto;
    }

    @Override
    public List<CategoryDTO> getAllCategories() {
        List<Category> categories = (List<Category>) categoryRepository.findAll();
        return categories.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    @Override
    public CategoryDTO getCategoriesByName(String name) {

        return categoryRepository.findByName(name);
    }
}
