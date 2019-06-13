package com.onlineShop.onlineShop.controller;

import com.onlineShop.onlineShop.model.PageParameters;
import com.onlineShop.onlineShop.model.Product;
import com.onlineShop.onlineShop.model.SortingType;
import com.onlineShop.onlineShop.service.CategoryService;
import com.onlineShop.onlineShop.service.CategoryServiceImpl;
import com.onlineShop.onlineShop.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductServiceImpl productServiceImpl;

    @Autowired
    private CategoryServiceImpl categoryServiceImpl;

    @RequestMapping("/insertarProducto")
    public String showInsertarProductForm(Model model){
        model.addAttribute("product", new Product());
        model.addAttribute("categories", categoryServiceImpl.listAllCategory());
        return "insertarProducto";
    }

    @PostMapping("/save")
     public String saveProduct(@ModelAttribute(value = "product") Product product) {
        productServiceImpl.addProduct(product);
        return "productInsertado";
    }

    @GetMapping("/listar")
    public String listProduct (Model model) {
        model.addAttribute("products", productServiceImpl.getAllProducts());
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

    @RequestMapping("/listproducts")
    public String getUserProductsView(Model modelAndView,
                                      @RequestParam(value = "sortdir", required = false) String sortingDirection,
                                      @RequestParam(value = "sortprop", required = false) String sortingProperty,
                                      @RequestParam(value = "page", required = false) String pageNumber,
                                      @RequestParam(value = "pageSize", required = false) String pageSize){
        PageParameters.setParameters(sortingDirection, sortingProperty, pageNumber, pageSize);
        modelAndView.addAttribute("products", productServiceImpl.getProductsSortedAndPagedByParameters());
        modelAndView.addAttribute("sortingTypes", SortingType.values());
        modelAndView.addAttribute("parameters", new PageParameters());
        return "userproducts";
    }


}
