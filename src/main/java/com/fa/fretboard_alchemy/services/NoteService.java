package com.fa.fretboard_alchemy.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.*;
import lombok.*;
import java.util.*;

import com.fa.fretboard_alchemy.entities.Note;
import com.fa.fretboard_alchemy.repositories.NoteRepository;

@Data
@NoArgsConstructor
@Service
public class NoteService {
    private NoteRepository repo;
    private String[] allNotes = {"A", "A#/Bb", "B", "C", 
                                       "C#/Db", "D", "D#/Eb", "E", 
                                       "F", "F#/Gb", "G", "G#/Ab"};

    public NoteService(NoteRepository repo) {
        this.repo = repo;
    }

    @Transactional
    public void createNote(String name) {
        repo.save(new Note(name));
    }

    @Transactional
    public void createNotes() {
        int ptr = 0;
        int len = allNotes.length;

        while (ptr < len) {
            String name = allNotes[ptr];
            createNote(name);

            ptr+=1;
        }
    }

    @Transactional
    public void printNotes() {
        List<Note> notes = repo.findAll();
        for (Note note : notes) {
            System.out.println(note.toString());
        }
    }
}
