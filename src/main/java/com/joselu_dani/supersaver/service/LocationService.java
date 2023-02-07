package com.joselu_dani.supersaver.service;

import com.joselu_dani.supersaver.model.Location;

import java.util.List;

public interface LocationService {
    List<Location> findAll();
    Location findById(long id);
    List<Location> findByAddress(String address);
    List<Location> findByPostalCode(int postalCode);
    List<Location> findByCity(String city);
    List<Location> findByCountry(String country);
    Location saveLocation(Location location);
    List<Location> findByAddressContains(String parcialAddress);
}
