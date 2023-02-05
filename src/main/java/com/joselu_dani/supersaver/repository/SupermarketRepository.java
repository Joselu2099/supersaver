package com.joselu_dani.supersaver.repository;

import com.joselu_dani.supersaver.model.Supermarket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SupermarketRepository extends JpaRepository<Supermarket, Long> {

    Supermarket findById(long id);
    Supermarket findByName(String username);
}
