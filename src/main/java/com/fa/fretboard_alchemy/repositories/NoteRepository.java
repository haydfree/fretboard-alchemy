package com.fa.fretboard_alchemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fa.fretboard_alchemy.entities.Note;

public interface NoteRepository extends JpaRepository<Note, Long> {
    
    Note findByName(String name);
}
