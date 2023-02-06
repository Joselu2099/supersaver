package com.joselu_dani.supersaver.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
    private long id;
    @Column(nullable=false)
    private String address;
    @Column(nullable=false)
    private int postalCode;
    @Column(nullable=false)
    private String city;
    @Column(nullable=false)
    private String country;
}
