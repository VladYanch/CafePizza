package com.example.cafepizza.repository;

import com.example.cafepizza.model.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Long> {
}
