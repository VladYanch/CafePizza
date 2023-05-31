package com.example.cafepizza.service;

import com.example.cafepizza.model.Cafe;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface CafeService {
    List<Cafe> findAll();

    Optional<Cafe> findById(long id);
    Cafe addOrUpdate(Cafe cafe);
}
