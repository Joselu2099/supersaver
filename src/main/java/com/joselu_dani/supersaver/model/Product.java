package com.joselu_dani.supersaver.model;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable=false)
    private String name;
    @Column(nullable=false)
    private String brand;
    private String image;
    @Column(nullable=false)
    private double price;
    @ManyToOne
    @JoinColumn(name="supermarket_id")
    private Supermarket supermarket;
}
