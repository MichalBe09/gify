package com.example.kwejk.data;

import model.Category;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
@Component
public class CategoryRepository {

    public static final List<Category> ALL_CATEGORIES = Arrays.asList(
            new Category(1,"funny"),
            new Category(2,"sport"),
            new Category(3,"it")
    );

    public static List<Category> getAllCategories(){
        return ALL_CATEGORIES;
    }





}
