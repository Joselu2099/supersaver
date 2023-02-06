package com.joselu_dani.supersaver.controller;

import com.joselu_dani.supersaver.model.Product;
import com.joselu_dani.supersaver.service.ProductService;
import com.joselu_dani.supersaver.service.SupermarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private SupermarketService supermarketService;

    @GetMapping("/")
    public String principal(Model model){
        model.addAttribute("supermarketList", supermarketService.selectRandomSupermarketByBrand());
        return "index";
    }
}
