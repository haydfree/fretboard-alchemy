package com.fa.fretboard_alchemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fa.fretboard_alchemy.entities.GuitarString;

public interface GuitarStringRepository extends JpaRepository<GuitarString, Long> {
    public GuitarString findByIdx(int idx);    
}
