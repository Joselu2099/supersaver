package com.joselu_dani.supersaver.service;

import com.joselu_dani.supersaver.model.Location;
import com.joselu_dani.supersaver.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {
    @Autowired
    private LocationRepository locationRepository;

    public List<Location> findAll(){
        return locationRepository.findAll();
    }

    public Location findById(long id){
        return locationRepository.findById(id);
    }

    public List<Location> findByPostalCode(int postalCode){
        return locationRepository.findByPostalCode(postalCode);
    }

    public List<Location> findByAddress(String address){
        return locationRepository.findByAddress(address);
    }

    public List<Location> findByCity(String city){
        return locationRepository.findByCity(city);
    }

}
