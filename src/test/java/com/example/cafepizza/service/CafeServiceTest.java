package com.example.cafepizza.service;

import com.example.cafepizza.PizzeriaData;
import com.example.cafepizza.model.Cafe;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
class CafeServiceTest {
    private static CafeService service;
    @BeforeAll
    static void setUp() {
        service = mock(CafeService.class);
        ArrayList<Cafe> cafeList = new ArrayList<>();
        Cafe cafe = PizzeriaData.createCafe();
        cafeList.add(cafe);
        when(service.findAll()).thenReturn(cafeList);
        when(service.findById(1L)).thenReturn(Optional.of(cafe));
    }
    @Test
    void findAllTest() {
        assertEquals(1, service.findAll().size());
    }
    @Test
    void deleteCafe() {
        service.deleteCafe(1L);
        assertEquals(1, service.findAll().size());
    }
    @Test
    void findById() {
        assertEquals("Pomodoro", service.findById(1L).get().getName());
    }
    @Test
    void addOrUpdate() {
        Cafe cafe1 = service.findById(1L).get();
        cafe1.setId(2L);
        assertTrue(cafe1.getId() == 2L);
        service.addOrUpdate(cafe1);
        assertFalse(service.findById(2L).isPresent());
    }
}