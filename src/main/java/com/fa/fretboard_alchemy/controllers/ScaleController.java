package com.fa.fretboard_alchemy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.fa.fretboard_alchemy.entities.Scale;
import com.fa.fretboard_alchemy.services.ScaleService;

@Controller
public class ScaleController {
    private final ScaleService scaleService;

    @Autowired
    public ScaleController(ScaleService scaleService) {
        this.scaleService = scaleService;
    }

    @GetMapping("/scales/{id}")
    public String getScale(@PathVariable Long id, Model model) {
        Scale scale = scaleService.getScaleById(id);
        model.addAttribute("scale", scale);
        return "scale";
    }

    @GetMapping("/scales/new")
    public String showCreateForm(Model model) {
        model.addAttribute("scale", new Scale());
        return "create_scale";
    }

    @PostMapping("/scales")
    public String createScale(Scale scale) {
        scaleService.createScale(scale);
        return "redirect:/scales/" + scale.getId();
    }
}

