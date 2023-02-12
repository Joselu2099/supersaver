package com.joselu_dani.supersaver.model;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "locations")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable=false)
    private String address;
    @Column(nullable=false)
    private int postalCode;
    @Column(nullable=false)
    private String city;

    @Override
    public String toString(){
        return address + ", " + postalCode + ", " + city;
    }
}
