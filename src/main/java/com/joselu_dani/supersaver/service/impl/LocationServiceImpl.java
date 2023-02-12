package com.joselu_dani.supersaver.service.impl;

import com.joselu_dani.supersaver.model.Location;
import com.joselu_dani.supersaver.repository.LocationRepository;
import com.joselu_dani.supersaver.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LocationServiceImpl implements LocationService {
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

    @Override
    public Location saveLocation(Location location) {
        return locationRepository.save(location);
    }

    @Override
    public List<Location> findByAddressContains(String parcialAddress){
        return locationRepository.findAll().stream()
                .filter(l -> l.getAddress().contains(parcialAddress))
                .collect(Collectors.toList());
    }

}
