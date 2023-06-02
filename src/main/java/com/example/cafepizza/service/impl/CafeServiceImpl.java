package com.example.cafepizza.service.impl;

import com.example.cafepizza.model.Cafe;
import com.example.cafepizza.model.Pizza;
import com.example.cafepizza.repository.CafeRepository;
import com.example.cafepizza.service.CafeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CafeServiceImpl implements CafeService {

    private final CafeRepository repository;
    @Autowired
    public CafeServiceImpl(CafeRepository repository) {
        this.repository = repository;
    }
    @Override
    public List<Cafe> findAll() {
        return repository.findAll();
    }
    public void deleteCafe(Long id) { repository.deleteById(id);}
    public Optional<Cafe> findById(Long id) {
        return repository.findById(id);
    }
    public void addOrUpdate(Cafe cafe) { repository.save(cafe);}
}
