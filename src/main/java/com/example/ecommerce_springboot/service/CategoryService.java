package com.example.ecommerce_springboot.service;

import com.example.ecommerce_springboot.dto.CategoryDto;
import com.example.ecommerce_springboot.entity.Category;

import java.util.List;

public interface CategoryService {
     CategoryDto createCategory(CategoryDto categoryDto);
     List<CategoryDto> findAllCategory();
     CategoryDto getCategoryById(Long id);
     CategoryDto updateCategory(Long id, CategoryDto categoryDto);
     void deleteCategory(Long id);
}
