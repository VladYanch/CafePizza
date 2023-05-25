package com.example.cafepizza.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.List;

@Entity
@Data
@Table(name = "pizza")
public class Pizza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    private String name;
    private Character size;
    private String key_ingredients;
    private double price;

    @ManyToOne
    @JoinColumn(name = "cafe_id")
    Cafe cafe;
}