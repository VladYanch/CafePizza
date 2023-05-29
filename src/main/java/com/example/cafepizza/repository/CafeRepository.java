package com.example.cafepizza.repository;

import com.example.cafepizza.model.Cafe;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CafeRepository extends JpaRepository<Cafe, Long> {
}