package com.guru.springframework.mastermvcrest.services;

import com.guru.springframework.mastermvcrest.dto.CategoryDTO;

import java.util.List;

public interface CategoryService {

    List<CategoryDTO> getAllCategories();
    CategoryDTO getCategoriesByName(String name);
}
