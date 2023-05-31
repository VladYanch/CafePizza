package com.example.cafepizza.controller;

import com.example.cafepizza.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//@RequestMapping("/")
//@RequestMapping("/pizza")
public class PizzaController {

    private final PizzaService service;

    @Autowired
    public PizzaController(PizzaService service) {
        this.service = service;
    }

    @GetMapping("/pizzas")
    public String index(Model model) {
        model.addAttribute("pizzas", service.findAll());
        return "pizzas";
    }
}
