package com.example.cafepizza.service;

import com.example.cafepizza.model.Pizza;
import org.springframework.stereotype.Component;

import java.util.List;

public interface PizzaService {
    List<Pizza> findAll();
}
