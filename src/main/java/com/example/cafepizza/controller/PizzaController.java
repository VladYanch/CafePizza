package com.example.cafepizza.controller;

import com.example.cafepizza.model.Pizza;
import com.example.cafepizza.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/pizzas")
public class PizzaController {

    private final PizzaService service;

    @Autowired
    public PizzaController(PizzaService service) {
        this.service = service;
    }

    @GetMapping()
    public String index(Model model) {
        model.addAttribute("pizzas", service.findAll());
        return "pizzas";
    }

    @PostMapping(value = "/delete")
    public String deletePizza(@RequestParam Long id, RedirectAttributes attributes) {
        service.deletePizza(id);
        attributes.addFlashAttribute("deleted", id);
        return "redirect:/pizzas";
    }
    @GetMapping(value = "/new")
    public String addPizza(@ModelAttribute ("pizza") Pizza pizza) {
        pizza.setId(7L);
        pizza.setName("Salami");
        pizza.setSize("standard");
        pizza.setKey_ingredients("Tomato sauce, salami, mozzarella");
        pizza.setPrice(7.00);
//        service.addPizza(pizza);
//        return "redirect:/pizzas";
        return "pizza";
//        return "create";
    }
//    @PostMapping("/create")
    @PostMapping()
    public String createPizza(@ModelAttribute ("pizza") Pizza pizza) {
        service.addPizza(pizza);
        return "redirect:/pizzas";
    }

    @PostMapping(value = "/edit")
    public String editPizza(@RequestParam Long id, RedirectAttributes attributes) {
        service.deletePizza(id);
        attributes.addFlashAttribute("edit", id);
        return "redirect:/pizza";
//        return "pizza";
    }

//    @GetMapping(value = "/pizza")
//    public String findPizza(@RequestParam Long id, RedirectAttributes attributes) {
////        service.findById(id);
//        service.findPizza(id);
//        attributes.addFlashAttribute("edit", id);
//        return "pizza";
//    }

}
