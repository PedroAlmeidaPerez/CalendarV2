package com.onlineShop.onlineShop.repository;


import com.onlineShop.onlineShop.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

    public List<User> findAll();

}

/*
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    User findByUsername(String username);
}*/
