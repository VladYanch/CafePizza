package com.example.cafepizza.service;

import com.example.cafepizza.model.Cafe;
import com.example.cafepizza.repository.CafeRepository;
import com.example.cafepizza.service.impl.CafeServiceImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class CafeServiceTest {
    private static CafeService service;
//    private final List<CafeService service;

    @BeforeAll
    void setUp() {
//        final CafeService service;
        CafeRepository repository = Mockito.mock(CafeRepository.class);
        service = new CafeServiceImpl(repository);
        Mockito(repository).wenn

    }

    @Test
    void findAll() {
        assertEquals(3, .findAll().stream().count());
    }

    @Test
    void deleteCafe() {
    }

    @Test
    void findById() {
    }

    @Test
    void addOrUpdate() {
    }
}