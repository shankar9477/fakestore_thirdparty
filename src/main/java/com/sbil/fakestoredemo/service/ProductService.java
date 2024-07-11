package com.sbil.fakestoredemo.service;

import com.sbil.fakestoredemo.model.Product;

import java.util.List;

public interface ProductService
{
    Product getSingleProduct(Long productId);
    List<Product> getAllProducts();
    Product createProduct(Product product);

    Product updateProduct(Long id, Product product);

    void deleteProduct(Long id);
}
