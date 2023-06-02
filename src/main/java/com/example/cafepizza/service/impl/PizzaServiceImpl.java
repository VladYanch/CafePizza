package com.example.cafepizza.service.impl;

import com.example.cafepizza.model.Pizza;
import com.example.cafepizza.repository.PizzaRepository;
import com.example.cafepizza.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PizzaServiceImpl implements PizzaService {

    private final PizzaRepository repository;

    @Autowired
    public PizzaServiceImpl(PizzaRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Pizza> findAll() {return repository.findAll();}
    @Override
    public void deletePizza(Long id) { repository.deleteById(id);}

    @Override
    public Optional<Pizza> findPizza(Long id) {
        return repository.findById(id);
    }

    @Override
    public void addPizza(Pizza pizza) { repository.save(pizza);}
}
