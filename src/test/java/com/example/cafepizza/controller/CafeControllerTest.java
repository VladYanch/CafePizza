package com.example.cafepizza.controller;

import com.example.cafepizza.model.Cafe;
import com.example.cafepizza.service.CafeService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(controllers = {CafeController.class}, excludeAutoConfiguration = SecurityAutoConfiguration.class)
public class CafeControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CafeService cafeService;

//    @MockBean
//    private MenuService menuService;

    @Autowired
    ObjectMapper objectMapper;


    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void findAllTest() throws Exception {
        List<Cafe> cafes = new ArrayList<>();
        cafes.add(new Cafe());

        when(cafeService.findAll()).thenReturn(cafes);

        mockMvc.perform(get("/cafes"))
                .andExpect(status().isOk())
                .andExpect(view().name("cafes/cafes"))
                .andExpect(model().attributeExists("cafes"))
                .andExpect(model().attribute("cafes", cafes));

        verify(cafeService, times(1)).findAll();
        verifyNoMoreInteractions(cafeService);
    }

    @Test
    void addCafeTest() throws Exception {

        mockMvc.perform(get("/cafes/new"))
                .andExpect(status().isOk())
                .andExpect(view().name("cafes/cafe"))
                .andExpect(model().attributeExists("cafe"));

        verifyNoMoreInteractions(cafeService);
    }

    @Test
    void createCafeTest() throws Exception {
        Cafe cafe = new Cafe();
        cafe.setId(4L);
        cafe.setName("Pomodoro");
        cafe.setCity("Odessa");
        cafe.setAddress("Glushko");
        cafe.setEmail("1@ua");
        cafe.setPhone("+38 222 333");
        cafe.setOpen("10:00");
        cafe.setClose("22:00");

        mockMvc.perform(post("/cafes/create")
                .flashAttr("cafe", cafe))
                .andExpect(status().is3xxRedirection())
                .andExpect(redirectedUrl("/cafes"));

        verify(cafeService, times(1)).addOrUpdate(cafe);
        verifyNoMoreInteractions(cafeService);
    }

    @Test
    public void deleteCafeTest() throws Exception {
        Long cafeId = 1L;

        mockMvc.perform(post("/cafes/delete")
                        .param("id", String.valueOf(cafeId)))
                .andExpect(status().is3xxRedirection())
                .andExpect(redirectedUrl("/cafes"));

        verify(cafeService, times(1)).deleteCafe(cafeId);
        verifyNoMoreInteractions(cafeService);
    }

//    @Test
//    public void editCafeTest() throws Exception {
//        Long cafeId = 1L;
//
//        mockMvc.perform(post("/cafes/edit")
////        mockMvc.perform(post("/edit")
//                .param("id", String.valueOf(cafeId)))
//                .andExpect(status().isOk());
//
////                .andExpect(status().is3xxRedirection())
////                .andExpect(redirectedUrl("cafe"));
////                .andExpect(redirectedUrl("cafes/cafe"));
////                .andExpect(redirectedUrl("cafes/edit"));
////                .andExpect(redirectedUrl("/cafes"));
//
//        verify(cafeService, times(1)).findById(cafeId);
//        verifyNoInteractions(cafeService);
//    }

//    @Test
//    void findCafe() {
//        Long cafeId = 1L;
//
//        mockMvc.perform(post("/cafes/delete")
//               .param("id", String.valueOf(cafeId)))
//                .andExpect(status()
//                .is3xxRedirection())
//                .andExpect(redirectedUrl("/cafes"));
//
//        verify(cafeService, times(1)).findById(cafeId);
//        verifyNoMoreInteractions(cafeService);
//    }
}