package com.joselu_dani.supersaver.service;

import com.joselu_dani.supersaver.model.Supermarket;
import com.joselu_dani.supersaver.repository.SupermarketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class SupermarketService {
    @Autowired
    private SupermarketRepository supermarketRepository;

    public List<Supermarket> findAll(){
        return supermarketRepository.findAll();
    }

    public Supermarket findById(long id){
        return supermarketRepository.findById(id);
    }

    public Supermarket findByName(String name){
        return supermarketRepository.findByName(name);
    }

    public List<Supermarket> findByBrand(String brand){
        return supermarketRepository.findByBrand(brand);
    }

    public List<Supermarket> selectRandomSupermarketByBrand() {
        List<Supermarket> supermarkets = supermarketRepository.findAll();
        return supermarkets.stream()
                .filter(s -> supermarkets.stream()
                        .filter(x -> x.getBrand()
                                .equals(s.getBrand()))
                        .count() == 1)
                .collect(Collectors.toList());
    }
}

