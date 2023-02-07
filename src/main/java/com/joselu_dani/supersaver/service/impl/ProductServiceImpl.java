package com.joselu_dani.supersaver.service.impl;

import com.joselu_dani.supersaver.model.Product;
import com.joselu_dani.supersaver.repository.ProductRepository;
import com.joselu_dani.supersaver.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
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

    public List<Product> findByBrand(String brand){ return productRepository.findByBrand(brand); }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> findByNameContains(String parcialName){
        return productRepository.findByNameContains(parcialName);
    }
}
