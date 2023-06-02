package com.example.cafepizza.controller;

import com.example.cafepizza.model.Cafe;
import com.example.cafepizza.service.CafeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

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
        return "cafes";
    }

    @PostMapping(value = "/delete")
    public String deleteCafe(@RequestParam Long id, RedirectAttributes attributes) {
        service.deleteCafe(id);
        attributes.addFlashAttribute("deleted", id);
        return "redirect:/cafes";
    }

//    @PostMapping(value = "/delete")
//    public String deleteCafe(@PathVariable ("id") Long id, RedirectAttributes attributes) {
//        service.deleteCafe(id);
//        attributes.addFlashAttribute("deleted", id);
//        return "redirect:/cafes";
//    }

    @PostMapping(value = "/edit")
    public String editCafe(@RequestParam Long id, RedirectAttributes attributes, Model model) {
        Optional<Cafe> cafe = service.findById(id);
        attributes.addFlashAttribute("edit", id);
//        model.addAttribute("cafe", service.findById(id));
        model.addAttribute("cafe", cafe);
//        return "redirect:/cafe";
//        return "/cafe";
        return "cafe";
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
