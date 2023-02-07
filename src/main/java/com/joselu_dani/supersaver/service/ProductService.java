package com.joselu_dani.supersaver.service;

import com.joselu_dani.supersaver.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    Product findById(long id);
    Product findByName(String address);
    List<Product> findByBrand(String brand);
    Product saveProduct(Product product);
    List<Product> findByNameContains(String partialName);
}
