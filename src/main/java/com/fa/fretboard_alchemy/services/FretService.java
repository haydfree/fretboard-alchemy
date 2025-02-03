package com.fa.fretboard_alchemy.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fa.fretboard_alchemy.entities.Fret;
import com.fa.fretboard_alchemy.repositories.FretRepository;

@Service
public class FretService {
    private final FretRepository fretRepository; 

    @Autowired
    public FretService(FretRepository fretRepository) {
        this.fretRepository = fretRepository;
    }

    public Fret getFretByIdx(int idx) {
        return fretRepository.findByIdx(idx);
    }

    public Fret createFret(Fret fret) {
        return fretRepository.save(fret);
    }
}

