package com.joselu_dani.supersaver.service.impl;

import com.joselu_dani.supersaver.model.Location;
import com.joselu_dani.supersaver.model.Supermarket;
import com.joselu_dani.supersaver.repository.SupermarketRepository;
import com.joselu_dani.supersaver.service.SupermarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SupermarketServiceImpl implements SupermarketService {
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

    @Override
    public List<Supermarket> findByLocation(Location location) {
        return supermarketRepository.findAll().stream()
                .filter(s -> s.getLocation().getAddress().equals(location.getAddress())
                        && s.getLocation().getPostalCode()==location.getPostalCode()
                        && s.getLocation().getCity().equals(location.getCity())
                        && s.getLocation().getCountry().equals(location.getCountry()))
                .collect(Collectors.toList());
    }

    @Override
    public Supermarket saveSupermarket(Supermarket supermarket) {
        return supermarketRepository.save(supermarket);
    }

    public List<Supermarket> findByNameContains(String partialName){
        return supermarketRepository.findByNameContains(partialName);
    }
}

