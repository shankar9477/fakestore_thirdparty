package com.sbil.fakestoredemo.dto;

import com.sbil.fakestoredemo.model.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO
{
    private Long id;
    private String title;
    private String description;
    private double price;
    private String imageUrl;
    private CategoryDTO category;

    public Product toProduct()
    {
        Product product = new Product();
        product.setId(this.id);
        product.setTitle(this.title);
        product.setDescription(this.description);
        product.setPrice(this.price);
        product.setImageUrl(this.imageUrl);
        product.setCategory(this.category.toCategory());
        return product;
    }
}
