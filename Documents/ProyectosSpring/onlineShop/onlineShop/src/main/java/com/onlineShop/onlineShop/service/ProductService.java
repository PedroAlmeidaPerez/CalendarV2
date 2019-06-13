package com.onlineShop.onlineShop.service;

import com.onlineShop.onlineShop.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {
/*
    Iterable<Product> listAllProducts();

    void addProduct(Product product);

    Product getProductById(Integer id);

    void deleteProduct(Integer id);
    */
    Page<Product> listAllByPage(Pageable pageable);
}
