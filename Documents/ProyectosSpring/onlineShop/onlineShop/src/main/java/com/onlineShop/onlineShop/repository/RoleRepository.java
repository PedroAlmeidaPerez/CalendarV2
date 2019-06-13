package com.onlineShop.onlineShop.repository;


import com.onlineShop.onlineShop.model.UserRole;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<UserRole, Long>{
}

/*
@Repository
public interface RoleRepository extends CrudRepository<UserRole, Integer> {

}*/
