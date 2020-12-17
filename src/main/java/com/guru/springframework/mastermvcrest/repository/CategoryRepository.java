package com.guru.springframework.mastermvcrest.repository;


import com.guru.springframework.mastermvcrest.domain.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<Category,Long> {

    Category findByName(String name);
}
