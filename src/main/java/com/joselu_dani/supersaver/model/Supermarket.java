package com.joselu_dani.supersaver.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "supermarkets")
public class Supermarket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable=false)
    private String name;
    @OneToOne
    @JoinColumn(name="location_id", nullable=false)
    private Location location;
    @OneToMany(mappedBy = "supermarket")
    private List<Product> productList;
}


