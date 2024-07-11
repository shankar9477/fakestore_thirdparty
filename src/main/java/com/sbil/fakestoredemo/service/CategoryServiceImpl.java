package com.sbil.fakestoredemo.service;

import com.sbil.fakestoredemo.dto.CategoryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService
{

    private final RestTemplate restTemplate;

    @Autowired
    public CategoryServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public CategoryDTO getCategoryById(Long id) {
        return restTemplate.getForObject(
                "https://fakestoreapi.com/products/categories/" + id,
                CategoryDTO.class
        );
    }

    @Override
    public List<CategoryDTO> getAllCategories() {
        CategoryDTO[] categories = restTemplate.getForObject(
                "https://fakestoreapi.com/products/categories",
                CategoryDTO[].class
        );
        return Arrays.asList(categories);
    }

    @Override
    public CategoryDTO createCategory(CategoryDTO category) {
        return restTemplate.postForObject(
                "https://fakestoreapi.com/products/categories",
                category,
                CategoryDTO.class
        );
    }

    @Override
    public CategoryDTO updateCategory(Long id, CategoryDTO category) {
        restTemplate.put(
                "https://fakestoreapi.com/products/categories/" + id,
                category
        );
        return getCategoryById(id); // Assuming the API returns the updated category on PUT
    }

    @Override
    public void deleteCategory(Long id) {
        restTemplate.delete("https://fakestoreapi.com/products/categories/" + id);
    }
}
