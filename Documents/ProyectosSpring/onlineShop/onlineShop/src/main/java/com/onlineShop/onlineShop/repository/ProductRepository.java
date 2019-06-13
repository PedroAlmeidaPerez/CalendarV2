package com.onlineShop.onlineShop.repository;


import com.onlineShop.onlineShop.model.Product;
import org.glassfish.api.Param;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends PagingAndSortingRepository<Product, Integer> {
    public Iterable<Product> findAllByOrderByPriceAsc();
    public Iterable<Product> findAllByOrderByPriceDesc();
    public Iterable<Product> findAllByName(String name);
    public Iterable<Product> findAllByCategoryId(int id);
    public Iterable<Product> findAllByOrderByNameAsc();
    public Iterable<Product> findAllByOrderByNameDesc();
    public Iterable<Product> findAll();



}
