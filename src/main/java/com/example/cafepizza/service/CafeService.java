package com.example.cafepizza.service;

import com.example.cafepizza.model.Cafe;

import java.util.List;

public interface CafeService {
    List<Cafe> findAll();

    Object findById(long id);
}
