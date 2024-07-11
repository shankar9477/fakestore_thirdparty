package com.sbil.fakestoredemo.repository;

import com.sbil.fakestoredemo.dto.ProductDTO;
import com.sbil.fakestoredemo.model.Product;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper
{
    private final ModelMapper modelMapper;

    @Autowired
    public ProductMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public ProductDTO toDTO(Product product) {
        return modelMapper.map(product, ProductDTO.class);
    }

    public Product toEntity(ProductDTO productDTO) {
        return modelMapper.map(productDTO, Product.class);
    }
}
