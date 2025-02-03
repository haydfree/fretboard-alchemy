package com.fa.fretboard_alchemy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.fa.fretboard_alchemy.entities.Chord;
import com.fa.fretboard_alchemy.services.ChordService;

@Controller
public class ChordController {
    private final ChordService chordService;

    @Autowired
    public ChordController(ChordService chordService) {
        this.chordService = chordService;
    }

    @GetMapping("/chords/{id}")
    public String getChord(@PathVariable Long id, Model model) {
        Chord chord = chordService.getChordById(id);
        model.addAttribute("chord", chord);
        return "chord";
    }

    @GetMapping("/chords/new")
    public String showCreateForm(Model model) {
        model.addAttribute("chord", new Chord());
        return "create_chord";
    }

    @PostMapping("/chords")
    public String createChord(Chord chord) {
        chordService.createChord(chord);
        return "redirect:/chords/" + chord.getId();
    }
}

