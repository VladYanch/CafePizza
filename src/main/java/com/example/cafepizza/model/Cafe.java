package com.example.cafepizza.model;

import lombok.Getter;
import lombok.Setter;

import java.sql.Time;

//@Entity
@Getter
@Setter
public class Cafe {

//    private String id;
    private int id;
    private String name;
    private String city;
    private String address;
    private String email;
    private String phone;
    private Time open_at;
    private Time close_at;
//    private List<Pizza> pizza_menu;

    public Cafe() {
    }

    public Cafe(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
