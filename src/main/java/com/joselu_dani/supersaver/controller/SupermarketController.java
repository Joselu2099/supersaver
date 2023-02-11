package com.joselu_dani.supersaver.controller;

import com.joselu_dani.supersaver.service.impl.SupermarketServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SupermarketController {
    @Autowired
    private SupermarketServiceImpl supermarketService;

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("supermarkets", supermarketService.findAll());
        return "index";
    }

    @GetMapping("/supermarkets")
    public String supermarkets(Model model) {
        model.addAttribute("supermarkets", supermarketService.findAll());
        return "supermarkets";
    }
}
