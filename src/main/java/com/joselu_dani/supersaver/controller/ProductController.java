package com.joselu_dani.supersaver.controller;

import com.joselu_dani.supersaver.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductServiceImpl productService;

    @GetMapping("/products")
    public String index(Model model) {
        model.addAttribute("products", productService.findAll());
        return "products";
    }
}

