package com.onlineShop.onlineShop.service;

import com.onlineShop.onlineShop.model.Category;
import com.onlineShop.onlineShop.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Category getCategoryById(Integer id) {
        return categoryRepository.findOne(id);
    }

    @Override
    public Iterable<Category> listAllCategory() {
        return categoryRepository.findAll();
    }

    @Override
    public void addCategory(Category category){
        categoryRepository.save(category);
    }

    @Override
    public void deleteCategory(Integer id) {
        categoryRepository.delete(id);
    }
}
