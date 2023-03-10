package com.joselu_dani.supersaver.repository;

import com.joselu_dani.supersaver.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    Product findById(long id);
    Product findByName(String name);
    List<Product> findByBrand(String brand);
    List<Product> findByNameContains(String partialName);
    List<Product> findBySupermarketId(Long idSupermarket);
}
