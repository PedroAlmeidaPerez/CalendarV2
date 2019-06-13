package com.onlineShop.onlineShop.controller;

//import com.onlineShop.onlineShop.model.Product;
import com.onlineShop.onlineShop.model.Category;
import com.onlineShop.onlineShop.service.CategoryService;
import com.onlineShop.onlineShop.service.CategoryServiceImpl;
//import com.onlineShop.onlineShop.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryServiceImpl categoryServiceImpl;

    @RequestMapping("/insertCategory")
    public String showInsertarCategoryForm(Model model){
        model.addAttribute("category", new Category());
        return "insertCategory";
    }


    @PostMapping("/save")
     public String saveCategory(@ModelAttribute(value = "category") Category category) {
        categoryServiceImpl.addCategory(category);
        return "categoryInsertado";
    }

/*
    @GetMapping("/listar")
    public String listProduct (Model model) {
        model.addAttribute("products", productServiceImpl.listAllProducts());
        return "listarProducto";
    }

    @RequestMapping("/{id}")
    public String showProduct(@PathVariable Integer id, Model model){
        model.addAttribute("product", productServiceImpl.getProductById(id));
        return "productShow";
    }

    @RequestMapping("/delete/{id}")
    public String deleteProduct(@PathVariable Integer id, Model model){
        productServiceImpl.deleteProduct(id);
        return "redirect:/product/listar";
    }

    @RequestMapping("/edit/{id}")
    public String editProduct (@PathVariable Integer id, Model model){
        model.addAttribute("product", productServiceImpl.getProductById(id));
        return "insertarProducto";
    }
*/

}
