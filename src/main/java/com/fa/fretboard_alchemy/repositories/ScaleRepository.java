package com.fa.fretboard_alchemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fa.fretboard_alchemy.entities.Scale;

public interface ScaleRepository extends JpaRepository<Scale, Long> {
    
    Scale findByName(String name);
}
