//package com.example.cafepizza.service;

import com.example.cafepizza.model.Cafe;
import com.example.cafepizza.repository.CafeRepository;
import com.example.cafepizza.service.impl.CafeServiceImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

//class CafeServiceTest {
//    private static CafeService service;
//    private static CafeRepository cafeRepository;
//    private final List<CafeService> cafeServiceList;

//    @BeforeAll
//    static void setUp() {
//        final CafeService service = mock(CafeService.class);
//        CafeRepository repository = Mockito.mock(CafeRepository.class);
//        service = Mockito.mock(repository);
//        when(service.findAll()).thenReturn(new ArrayList<Cafe>());
//    }

//    @Test
//    void findAllTest() {
//        assertEquals(3, service.findAll().size());
//    }

//    @Test
//    void deleteCafe() {
//    }
//
//    @Test
//    void findById() {
//    }
//
//    @Test
//    void addOrUpdate() {
//    }
//}