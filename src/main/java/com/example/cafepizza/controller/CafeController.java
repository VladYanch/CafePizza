package com.example.cafepizza.controller;

import com.example.cafepizza.service.CafeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CafeController {
    private final CafeService service;

    @Autowired
    public CafeController(CafeService service) {
        this.service = service;
    }

    @GetMapping("/cafes")
    public String index(Model model) {
        model.addAttribute("cafes", service.findAll());
        return "cafes";
    }


    @GetMapping("/cafes/{id}")
    public String findId(@RequestParam("id") long id, Model model) {
        model.addAttribute("cafes", service.findById(id));
//        return "CafeFindId";
        return "сafe";

//    public String editId(@RequestParam("id") long id, Model model) {
//    @PostMapping("/cafes/edit")
//    public String editId(Long 1, Model model) {
//        model.addAttribute("cafes", service.findById(id));
////        return "CafeFindId";
//        return "сafe";
    }


}
