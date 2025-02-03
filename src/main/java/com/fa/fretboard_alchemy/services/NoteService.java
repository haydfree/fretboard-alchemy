package com.fa.fretboard_alchemy.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fa.fretboard_alchemy.entities.Note;
import com.fa.fretboard_alchemy.repositories.NoteRepository;

@Service
public class NoteService {
    private final NoteRepository noteRepository; 

    @Autowired
    public NoteService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    public Note getNoteById(Long id) {
        return noteRepository.findById(id).orElse(null);
    }

    public Note createNote(Note note) {
        return noteRepository.save(note);
    }
}

