package com.example.cafepizza.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "cafe")
public class Cafe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String city;
    private String address;
    private String email;
    private String phone;
    private String open;
    private String close;

    @OneToMany(mappedBy = "cafe",cascade = CascadeType.ALL)
    List<Pizza> pizza_menu = new ArrayList<>();

}
