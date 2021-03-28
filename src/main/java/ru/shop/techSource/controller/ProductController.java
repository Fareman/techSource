package ru.shop.techSource.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ru.shop.techSource.service.ProductService;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public String Home(Model model){
        model.addAttribute("listProduct", productService.getAllProducts());
        return "index";
    }
}
