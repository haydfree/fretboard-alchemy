package com.fa.fretboard_alchemy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.fa.fretboard_alchemy.entities.Fret;
import com.fa.fretboard_alchemy.services.FretService;

@Controller
public class FretController {
    private final FretService fretService;

    @Autowired
    public FretController(FretService fretService) {
        this.fretService = fretService;
    }

    @GetMapping("/frets/{idx}")
    public String getFret(@PathVariable int idx, Model model) {
        Fret fret = fretService.getFretByIdx(idx);
        model.addAttribute("fret", fret);
        return "fret";
    }
}

