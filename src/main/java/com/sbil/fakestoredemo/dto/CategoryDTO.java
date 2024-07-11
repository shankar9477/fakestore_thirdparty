package com.sbil.fakestoredemo.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import com.sbil.fakestoredemo.model.* ;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDTO
{

    private Long id;
    private String title;

    public Category toCategory()
    {
        Category category = new Category();
        category.setId(this.id);
        category.setTitle(this.title);
        return category;
    }
}
