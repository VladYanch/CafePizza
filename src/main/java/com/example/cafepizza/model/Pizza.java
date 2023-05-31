package com.example.cafepizza.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "pizza")
public class Pizza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String size;
    private String key_ingredients;
    private double price;

    @ManyToOne
    @JoinColumn(name = "cafe_id")
    private Cafe cafe;
}