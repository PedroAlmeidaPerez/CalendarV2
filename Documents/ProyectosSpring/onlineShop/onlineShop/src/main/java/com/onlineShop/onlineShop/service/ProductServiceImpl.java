package com.onlineShop.onlineShop.service;

import com.onlineShop.onlineShop.model.PageParameters;
import com.onlineShop.onlineShop.model.Product;
import com.onlineShop.onlineShop.repository.ProductRepository;
import com.onlineShop.onlineShop.repository.RoleRepository;
import com.sun.tools.javac.comp.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Sort.Direction;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
/*
@Service
public class ProductServiceImpl implements ProductService{

    //Inyeccion por constructor
    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    public Iterable<Product> getProductsSortedAndPagedByParameters() {
        Direction direction = setSortingDirection(PageParameters.sortingDirection);
        return productRepository.findAll( new PageRequest(
                Integer.parseInt(PageParameters.pageNumber),
                Integer.parseInt(PageParameters.pageSize),
                direction,
                PageParameters.sortingProperty));
    }

    private Direction setSortingDirection(String sortingDirection) {
        Direction direction;
        switch (sortingDirection){
            case "Asc":
                direction = Direction.ASC;
                break;
            case "Desc":
                direction = Direction.DESC;
                break;
            default:
                direction = Direction.ASC;
                break;
        }
        return direction;
    }

    public Page<Product> listAllByPage(Pageable pageable){
        return null;
    }

    @Override
    public Product getProductById(Integer id) {
        return productRepository.findOne(id);
    }

    @Override
    public Iterable<Product> listAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public void addProduct(Product product){
        productRepository.save(product);
    }

    @Override
    public void deleteProduct(Integer id) {
        productRepository.delete(id);
    }
}
*/

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    public Iterable<Product> getAllProducts(){
        List<Product> products = new ArrayList<>();
        productRepository.findAll().forEach(products::add);
        return products;
    }

    public void addProduct(Product product){
        productRepository.save(product);
    }

    public Product getProductById(int id){
        return productRepository.findOne(id);
    }

    public Product getProduct(int id){
        return productRepository.findOne(id);
    }

    public void updateProduct(Product product){
        addProduct(product);
    }

    public void deleteProduct(int id){
        productRepository.delete(id);
    }


    public Iterable<Product> getProductsSortedAndPagedByParameters() {
        Direction direction = setSortingDirection(PageParameters.sortingDirection);
        return productRepository.findAll(new PageRequest(
                Integer.parseInt(PageParameters.pageNumber),
                Integer.parseInt(PageParameters.pageSize),
                direction,
                PageParameters.sortingProperty));
    }

    private Direction setSortingDirection(String sortingDirection) {
        Direction direction;
        switch (sortingDirection){
            case "Asc":
                direction = Direction.ASC;
                break;
            case "Desc":
                direction = Direction.DESC;
                break;
            default:
                direction = Direction.ASC;
                break;
        }
        return direction;
    }

    public Page<Product> listAllByPage(Pageable pageable){
        return null;
    }

}
