package com.onlineShop.onlineShop.service;


import com.onlineShop.onlineShop.model.User;


public interface UserService {
    void save(User user);

    User findByUsername(String username);


}

/*
public interface UserService {

    Iterable<User> listAllUsers();

    void addUser(User user);

    User getUserById(Integer id);

    void deleteUser(Integer id);

}*/
