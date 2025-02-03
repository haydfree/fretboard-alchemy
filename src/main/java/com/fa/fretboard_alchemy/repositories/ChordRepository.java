package com.fa.fretboard_alchemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fa.fretboard_alchemy.entities.Chord;

public interface ChordRepository extends JpaRepository<Chord, Long> {
    
    Chord findByName(String name);
}
