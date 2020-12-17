package com.guru.springframework.mastermvcrest;

import com.guru.springframework.mastermvcrest.domain.Category;
import com.guru.springframework.mastermvcrest.dto.CategoryDTO;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MasterMvcRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MasterMvcRestApplication.class, args);
    }
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }



}
