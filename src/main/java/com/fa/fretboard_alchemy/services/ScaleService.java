package com.fa.fretboard_alchemy.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import jakarta.persistence.*;
import lombok.*;
import java.util.*;

import com.fa.fretboard_alchemy.entities.Scale;
import com.fa.fretboard_alchemy.repositories.ScaleRepository;
import com.fa.fretboard_alchemy.services.NoteService;

@Data
@NoArgsConstructor
@Service
public class ScaleService {
    private ScaleRepository repo;
    private NoteService noteService;

    private int[] modal = {2,2,1,2,2,2,1};
    private int[] pentatonic = {2,2,3,2,3};
    private int[] harmonic = {2,1,2,2,1,3,1};
    private int[] blues = {2,1,1,3,2,3};

    public ScaleService(ScaleRepository repo, NoteService noteService) {
        this.repo = repo; 
        this.noteService = noteService;
    }

    private int[] shiftIntervals(int[] intervals, int offset) {
        int ptr = 1;
        int len = intervals.length;
        int first = intervals[0];

        while (ptr < len) {
            int temp = intervals[ptr-1];
            intervals[ptr-1] = intervals[ptr];
            intervals[ptr] = temp;
            
            ptr+=1;
        }

        intervals[len-1] = first;
        return intervals;
    }

    private int[] getIntervals(int[] intervals, int offset) {
        return shiftIntervals(intervals, offset);
    }

    public void createScale(int[] intervals, int offset) {
        List<Note> scale = new ArrayList<>();
        
    }
}


