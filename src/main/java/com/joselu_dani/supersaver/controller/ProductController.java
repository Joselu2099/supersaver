package com.joselu_dani.supersaver.controller;

import com.joselu_dani.supersaver.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    private final ProductServiceImpl productService;

    @Autowired
    public ProductController(ProductServiceImpl productService) {
        this.productService = productService;
    }

    /*
    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.findAll();
    }
    */
}

