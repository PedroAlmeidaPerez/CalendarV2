package com.onlineShop.onlineShop.service;

import com.onlineShop.onlineShop.model.UserRole;
import com.onlineShop.onlineShop.repository.RoleRepository;
import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;


    public List<UserRole> getAllRoles(){
        List<UserRole> rols = new ArrayList<>();
        roleRepository.findAll().forEach(rols::add);
        return rols;
    }

    public void addRole(UserRole userRole){
        roleRepository.save(userRole);
    }
}