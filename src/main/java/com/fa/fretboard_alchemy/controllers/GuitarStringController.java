package com.fa.fretboard_alchemy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.fa.fretboard_alchemy.entities.GuitarString;
import com.fa.fretboard_alchemy.services.GuitarStringService;

@Controller
public class GuitarStringController {
    private final GuitarStringService guitarStringService;

    @Autowired
    public GuitarStringController(GuitarStringService guitarStringService) {
        this.guitarStringService = guitarStringService;
    }

    @GetMapping("/guitarStrings/{idx}")
    public String getGuitarString(@PathVariable int idx, Model model) {
        GuitarString guitarString = guitarStringService.getGuitarStringByIdx(idx);
        model.addAttribute("guitarString", guitarString);
        return "guitarString";
    }
}

