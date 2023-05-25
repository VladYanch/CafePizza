package com.example.cafepizza.controller;

import com.example.cafepizza.dao.CafeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class CafeController {
    private final CafeDAO cafeDAO;

    @Autowired
    public CafeController(CafeDAO cafeDAO) {
        this.cafeDAO = cafeDAO;
    }

    @GetMapping("/cafes")
    public String index(Model model) {
        model.addAttribute("cafes", cafeDAO.index());
        return "CafeIndex";
    }

//    @GetMapping("/cafes/{id}")
//    public String findId(@RequestParam("id") int id, Model model) {
//        model.addAttribute("cafes", cafeDAO.cafeId(id));
//        return "CafeFindId";
//    }


}
