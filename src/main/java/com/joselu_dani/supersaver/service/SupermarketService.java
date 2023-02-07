package com.joselu_dani.supersaver.service;

import com.joselu_dani.supersaver.model.Location;
import com.joselu_dani.supersaver.model.Supermarket;

import java.util.List;

public interface SupermarketService {
    List<Supermarket> findAll();
    Supermarket findById(long id);
    Supermarket findByName(String name);
    List<Supermarket> findByLocation(Location location);
    Supermarket saveSupermarket(Supermarket supermarket);
    List<Supermarket> findByNameContains(String partialName);
}
