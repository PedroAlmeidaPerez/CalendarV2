package com.onlineShop.onlineShop.service;

import com.onlineShop.onlineShop.model.Category;

public interface CategoryService {

    Iterable<Category> listAllCategory();

    void addCategory(Category category);

    Category getCategoryById(Integer id);

    void deleteCategory(Integer id);

}
