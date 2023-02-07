package com.joselu_dani.supersaver.controller;

import com.joselu_dani.supersaver.service.impl.SupermarketServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SupermarketController {
    private final SupermarketServiceImpl supermarketService;

    public SupermarketController(SupermarketServiceImpl supermarketService) {
        this.supermarketService = supermarketService;
    }

    @GetMapping("/supermarkets")
    public String index(Model model) {
        model.addAttribute("supermarkets", supermarketService.findAll());
        return "supermarkets";
    }
}
