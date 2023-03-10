package com.joselu_dani.supersaver.controller;

import com.joselu_dani.supersaver.model.Supermarket;
import com.joselu_dani.supersaver.service.ProductService;
import com.joselu_dani.supersaver.service.SupermarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private SupermarketService supermarketService;

    @GetMapping("/products")
    public String index(Model model) {
        model.addAttribute("products", productService.findAll());
        return "products";
    }

    @GetMapping("/supermarkets/{supermarketId}/products")
    public String productsBySupermarket(@PathVariable long supermarketId, Model model) {
        Supermarket supermarket = supermarketService.findById(supermarketId);
        model.addAttribute("products", productService.findBySupermarketId(supermarketId));
        model.addAttribute("supermarket", supermarket);
        return "supermarketProducts";
    }
}
