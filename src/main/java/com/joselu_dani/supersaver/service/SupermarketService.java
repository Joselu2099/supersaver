package com.joselu_dani.supersaver.service;

import com.joselu_dani.supersaver.model.Supermarket;
import com.joselu_dani.supersaver.repository.SupermarketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

}
