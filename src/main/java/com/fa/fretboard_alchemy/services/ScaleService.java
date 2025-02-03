package com.fa.fretboard_alchemy.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fa.fretboard_alchemy.entities.Scale;
import com.fa.fretboard_alchemy.repositories.ScaleRepository;

@Service
public class ScaleService {
    private final ScaleRepository scaleRepository; 

    @Autowired
    public ScaleService(ScaleRepository scaleRepository) {
        this.scaleRepository = scaleRepository;
    }

    public Scale getScaleById(Long id) {
        return scaleRepository.findById(id).orElse(null);
    }

    public Scale createScale(Scale scale) {
        return scaleRepository.save(scale);
    }
}

