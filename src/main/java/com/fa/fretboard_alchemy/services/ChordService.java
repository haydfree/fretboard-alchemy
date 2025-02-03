package com.fa.fretboard_alchemy.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fa.fretboard_alchemy.entities.Chord;
import com.fa.fretboard_alchemy.repositories.ChordRepository;

@Service
public class ChordService {
    private final ChordRepository chordRepository; 

    @Autowired
    public ChordService(ChordRepository chordRepository) {
        this.chordRepository = chordRepository;
    }

    public Chord getChordById(Long id) {
        return chordRepository.findById(id).orElse(null);
    }

    public Chord createChord(Chord chord) {
        return chordRepository.save(chord);
    }
}

