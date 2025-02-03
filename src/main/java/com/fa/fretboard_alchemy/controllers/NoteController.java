package com.fa.fretboard_alchemy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.fa.fretboard_alchemy.entities.Note;
import com.fa.fretboard_alchemy.services.NoteService;

@Controller
public class NoteController {
    private final NoteService noteService;

    @Autowired
    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @GetMapping("/notes/{id}")
    public String getNote(@PathVariable Long id, Model model) {
        Note note = noteService.getNoteById(id);
        model.addAttribute("note", note);
        return "note";
    }

    @GetMapping("/notes/new")
    public String showCreateForm(Model model) {
        model.addAttribute("note", new Note());
        return "create_note";
    }

    @PostMapping("/notes")
    public String createNote(Note note) {
        noteService.createNote(note);
        return "redirect:/notes/" + note.getId();
    }
}

