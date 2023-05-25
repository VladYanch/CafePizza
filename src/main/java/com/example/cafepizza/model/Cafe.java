package com.example.cafepizza.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.sql.Time;
import java.util.List;

@Entity
@Data
@Table(name = "cafe")
public class Cafe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String city;
    private String address;
    private String email;
    private String phone;
    private Time open_at;
    private Time close_at;

//    @OneToMany(targetEntity = "pizza")
//    List<Pizza> pizza_menu;


}
