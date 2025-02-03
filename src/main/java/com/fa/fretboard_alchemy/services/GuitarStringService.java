package com.fa.fretboard_alchemy.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fa.fretboard_alchemy.entities.GuitarString;
import com.fa.fretboard_alchemy.repositories.GuitarStringRepository;

@Service
public class GuitarStringService {
    private final GuitarStringRepository guitarStringRepository; 

    @Autowired
    public GuitarStringService(GuitarStringRepository guitarStringRepository) {
        this.guitarStringRepository = guitarStringRepository;
    }

    public GuitarString getGuitarStringByIdx(int idx) {
        return guitarStringRepository.findByIdx(idx);
    }

    public GuitarString createGuitarString(GuitarString guitarString) {
        return guitarStringRepository.save(guitarString);
    }
}

