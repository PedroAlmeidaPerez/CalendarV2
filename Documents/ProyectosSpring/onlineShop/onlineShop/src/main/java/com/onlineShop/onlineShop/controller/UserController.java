package com.onlineShop.onlineShop.controller;

import com.onlineShop.onlineShop.model.User;

import com.onlineShop.onlineShop.service.RoleService;
import com.onlineShop.onlineShop.service.UserDetailsServiceImpl;
import com.onlineShop.onlineShop.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



@Controller
public class UserController {
    @Autowired
    private UserDetailsServiceImpl userDetailsServiceImpl;

    @Autowired
    private UserServiceImpl userServiceImp;

    @Autowired
    private RoleService roleService;


    @GetMapping("/admin/createuser")
    public String createAllUsers(Model model) {
        //  model.addAllAttributes("users", userDetailsServiceImpl.loadUserByUsername(username));
        //model.addAttribute("users", userDetailsServiceImpl.getAllUsers());
        model.addAttribute("user", new User());
        model.addAttribute("roles", roleService.getAllRoles());
        return "createuser";
    }
    @PostMapping("/saveuser")
    public String saveUser(Model model,@ModelAttribute(value="user") User user) {
        userServiceImp.save(user);
        model.addAttribute("user",user);
        //userDetailsServiceImpl.addUser(user);
        return "resultuser";
    }

    @RequestMapping("/admin/allusers")
    public String showUsers(Model model) {
        model.addAttribute("users", userServiceImp.getAllUsers());
        model.addAttribute("roles", roleService.getAllRoles());
        return "allusers";
    }



/*
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImpl userServiceImpl;

    @Autowired
    private RoleService roleServiceImpl;

    @RequestMapping("/insertarUser")
    public String showInsertarUserForm(Model model){
        model.addAttribute("user", new User());
        model.addAttribute("roles", roleServiceImpl.listAllRoles());
        return "insertarUsuario";
    }

    @PostMapping("/save")
     public String saveUser(@ModelAttribute(value = "user") User user) {
        userServiceImpl.addUser(user);
        return "userInsertado";
    }

    @GetMapping("/listar")
    public String listProduct (Model model) {
        model.addAttribute("users", userServiceImpl.listAllUsers());
        return "listarProducto";
    }*/
/*
    @RequestMapping("/{id}")
    public String showProduct(@PathVariable Integer id, Model model){
        model.addAttribute("product", userServiceImpl.getProductById(id));
        return "productShow";
    }

    @RequestMapping("/delete/{id}")
    public String deleteProduct(@PathVariable Integer id, Model model){
        userServiceImpl.deleteProduct(id);
        return "redirect:/product/listar";
    }

    @RequestMapping("/edit/{id}")
    public String editProduct (@PathVariable Integer id, Model model){
        model.addAttribute("product", userServiceImpl.getProductById(id));
        return "insertarProducto";
    }
*/

}
