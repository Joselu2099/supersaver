package com.joselu_dani.supersaver.repository;

import com.joselu_dani.supersaver.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {
    Location findById(long id);
    List<Location> findByPostalCode(int postalCode);
    List<Location> findByAddress(String address);
    List<Location> findByCity(String city);
    List<Location> findByAddressContains(String parcialAddress);
}
