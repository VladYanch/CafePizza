package com.example.cafepizza.controller;

import com.example.cafepizza.model.Cafe;
import com.example.cafepizza.service.CafeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;

@Controller
@RequestMapping("/cafes")
@SessionAttributes("editCafe")
public class CafeController {
    private final CafeService service;

    @Autowired
    public CafeController(CafeService service) {
        this.service = service;
    }

    @GetMapping()
    public String index(Model model) {
        model.addAttribute("cafes", service.findAll());
        return "cafes/cafes";
    }

    @PostMapping(value = "/delete")
    public String deleteCafe(@RequestParam Long id, RedirectAttributes attributes) {
        service.deleteCafe(id);
        attributes.addFlashAttribute("deleted", id);
        return "redirect:/cafes";
    }
    @GetMapping(value = "/new")
    public String addCafe(@ModelAttribute ("cafe") Cafe cafe) { return "cafes/cafe";}
    @PostMapping("/create")
    public String createCafe(@ModelAttribute ("cafe") @Valid Cafe cafe, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) return "cafes/cafe";
        service.addOrUpdate(cafe);
        return "redirect:/cafes";
    }
    @GetMapping(value = "/edit")
    public String findCafe(@RequestParam ("id") Long id, Model model ) {
        model.addAttribute("cafe",service.findById(id).get());
        return "cafes/cafe";
    }

    @GetMapping(value = "/show")
    public String showCafeWithMenu(@RequestParam ("id") Long id, Model model ) {
        model.addAttribute("cafe",service.findById(id).get());
        model.addAttribute("pizzas",service.menuById(id));
        return "cafes/menu";
    }
//    @GetMapping("/cafes/{id}")
//    public String findId(@RequestParam("id") long id, Model model) {
//        model.addAttribute("cafes", service.findById(id));
////        return "CafeFindId";
//        return "сafe";
//    }

//    @PostMapping("/cafes/{id}")
//    public String editId(Long id, Model model) {
//        model.addAttribute("cafes", service.findById(id));
////        model.addAttribute("cafes", service.findById(1));
////        return "CafeFindId";
//        return "сafe";
//    }

}
