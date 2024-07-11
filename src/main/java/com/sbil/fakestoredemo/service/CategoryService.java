package com.sbil.fakestoredemo.service;

import com.sbil.fakestoredemo.dto.CategoryDTO;

import java.util.List;

public interface CategoryService
{
    CategoryDTO getCategoryById(Long id);
    List<CategoryDTO> getAllCategories();
    CategoryDTO createCategory(CategoryDTO category);
    CategoryDTO updateCategory(Long id, CategoryDTO category);
    void deleteCategory(Long id);
}
