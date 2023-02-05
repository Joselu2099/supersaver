package com.joselu_dani.supersaver.service;

import com.joselu_dani.supersaver.model.Product;
import com.joselu_dani.supersaver.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Product findById(long id){
        return productRepository.findById(id);
    }

    public Product findByName(String name){
        return productRepository.findByName(name);
    }

    List<Product> findByNameContains(String parcialName){
        return productRepository.findByNameContains(parcialName);
    }
}
