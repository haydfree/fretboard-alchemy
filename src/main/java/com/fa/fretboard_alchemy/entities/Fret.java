package com.fa.fretboard_alchemy.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import java.util.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "frets")
public class Fret {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    private List<GuitarString> guitarStrings = new ArrayList<>();

    @ManyToMany
    private List<Note> notes = new ArrayList<>();

    @ManyToMany
    private List<Chord> chords = new ArrayList<>();

    @ManyToMany
    private List<Scale> scales = new ArrayList<>();
   
    @Min(0) @Max(24)
    @Column(name = "fret_idx")
    private int idx;

    public Fret(int idx) {
        this.idx = idx;
    }

}
