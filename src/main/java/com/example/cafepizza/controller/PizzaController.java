package com.example.cafepizza.controller;

import com.example.cafepizza.model.Pizza;
import com.example.cafepizza.service.PizzaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/pizzas")
@SessionAttributes("editPizza")
public class PizzaController {
    private final PizzaService service;
    @Autowired
    public PizzaController(PizzaService service) {
        this.service = service;
    }
    @GetMapping()
    public String index(Model model) {
        model.addAttribute("pizzas", service.findAll());
        return "pizzas/pizzas";
    }
    @PostMapping(value = "/delete")
    public String deletePizza(@RequestParam Long id, RedirectAttributes attributes) {
        service.deletePizza(id);
        attributes.addFlashAttribute("deleted", id);
        return "redirect:/pizzas";
    }
    @GetMapping(value = "/new")
    public String addPizza(@ModelAttribute ("pizza") Pizza pizza) {
        pizza.setImage("/img/marherita.jpeg");
        pizza.setName("New Pizza");
        return "pizzas/new";
    }
    @PostMapping("/create")
    public String createPizza(@ModelAttribute ("pizza") @Valid Pizza pizza, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) return "pizzas/new";
        service.addOrUpdate(pizza);
        return "redirect:/pizzas";
    }
    @GetMapping(value = "/edit")
    public String findPizza(@RequestParam ("id") Long id, Model model ) {
        model.addAttribute("pizza",service.findById(id).get());
        return "pizzas/pizza";
    }
}
