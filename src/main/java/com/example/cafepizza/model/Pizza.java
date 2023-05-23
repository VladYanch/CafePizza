package com.example.cafepizza.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pizza {
    private String id;
//    private Cafe;
    private String name;
    private Character size;
    private String key_ingredients;
    private double price;

//    @Id
    public Pizza(String name) {
        this.id = id;
        this.name = name;
    }
}