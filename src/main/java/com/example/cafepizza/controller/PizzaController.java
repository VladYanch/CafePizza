package com.example.cafepizza.controller;

import com.example.cafepizza.model.Pizza;
import com.example.cafepizza.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/pizza")
public class PizzaController {

    private final PizzaService service;
    @Autowired
    public PizzaController(PizzaService service) {
        this.service = service;
    }

    @GetMapping("/pizza")
    public String index(Model model) {
//        model.addAttribute("pizza", pizzaDAO.index());
        model.addAttribute("pizza");
        return "pizza";
    }
}
