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
        List<Supermarket> allSupermarkets = findAll();
        Map<String, List<Supermarket>> groupedSupermarkets = allSupermarkets.stream().collect(Collectors.groupingBy(Supermarket::getBrand));
        List<Supermarket> selectedSupermarkets = new ArrayList<>();
        Random random = new Random();
        groupedSupermarkets.forEach((brand, supermarkets) -> {
            int randomIndex = random.nextInt(supermarkets.size());
            selectedSupermarkets.add(supermarkets.get(randomIndex));
        });
        return selectedSupermarkets;
    }
}

