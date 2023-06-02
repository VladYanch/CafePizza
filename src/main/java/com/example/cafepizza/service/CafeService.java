package com.example.cafepizza.service;

import com.example.cafepizza.model.Cafe;
import com.example.cafepizza.model.Pizza;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface CafeService {
    List<Cafe> findAll();
    void deleteCafe(Long id);
    Optional<Cafe> findById(Long id);
    void addOrUpdate(Cafe cafe);

}
