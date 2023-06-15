package com.example.cafepizza.controller;

import com.example.cafepizza.model.Cafe;
import com.example.cafepizza.model.Pizza;
import com.example.cafepizza.service.CafeService;
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
    private final CafeService serviceCafe;
    @Autowired
    public PizzaController(PizzaService service, CafeService serviceCafe) {
        this.service = service;
        this.serviceCafe = serviceCafe;
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
    public String addPizza(@ModelAttribute ("pizza") Pizza pizza, Model model) {
        pizza.setImage("/img/marherita.jpeg");
        pizza.setName("New Pizza");
        model.addAttribute("cafes", serviceCafe.findAll());
        return "pizzas/new";
    }
    @PostMapping("/create")
//    public String createPizza(@ModelAttribute ("pizza") @Valid Pizza pizza, BindingResult bindingResult,@ModelAttribute ("cafes") Cafe cafe, Model model) {
    public String createPizza(@ModelAttribute ("pizza") @Valid Pizza pizza, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute(pizza);
            return "pizzas/pizza";
        }
        service.addOrUpdate(pizza);
        return "redirect:/pizzas";
    }
    @GetMapping(value = "/edit")
    public String findPizza(@RequestParam ("id") Long id, Model model) {
        model.addAttribute("pizza",service.findById(id).get());
//        model.addAttribute("cafes",serviceCafe.findById(id).get());
//        model.addAttribute("cafes",serviceCafe.findAll());
        return "pizzas/pizza";
    }
}
