package com.joselu_dani.supersaver.controller;

import com.joselu_dani.supersaver.service.SupermarketService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SupermarketController {
    private final SupermarketService supermarketService;

    public SupermarketController(SupermarketService supermarketService) {
        this.supermarketService = supermarketService;
    }

    @GetMapping("/supermarkets")
    public String index(Model model) {
        model.addAttribute("supermarkets", supermarketService.findAll());
        return "index";
    }
}
