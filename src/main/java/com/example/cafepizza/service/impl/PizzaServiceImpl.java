package com.example.cafepizza.service.impl;

import com.example.cafepizza.model.Pizza;
import com.example.cafepizza.repository.PizzaRepository;
import com.example.cafepizza.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzaServiceImpl implements PizzaService {

    private final PizzaRepository repository;

    @Autowired
    public PizzaServiceImpl(PizzaRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Pizza> getAll() {
        return repository.findAll();
    }
}
