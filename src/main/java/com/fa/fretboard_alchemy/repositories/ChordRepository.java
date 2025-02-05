package com.fa.fretboard_alchemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fa.fretboard_alchemy.entities.Chord;

@Repository
public interface ChordRepository extends JpaRepository<Chord, Long> {

}
