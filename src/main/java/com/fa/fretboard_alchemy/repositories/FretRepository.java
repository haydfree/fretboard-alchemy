package com.fa.fretboard_alchemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fa.fretboard_alchemy.entities.Fret;

public interface FretRepository extends JpaRepository<Fret, Long> {
    
}
