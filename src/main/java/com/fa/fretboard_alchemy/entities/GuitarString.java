package com.fa.fretboard_alchemy.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import java.util.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "guitar_strings")
public class GuitarString {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    private List<Note> notes = new ArrayList<>();

    @ManyToMany
    private List<Scale> scales = new ArrayList<>();

    @ManyToMany
    private List<Fret> frets = new ArrayList<>();

    @ManyToMany
    private List<Chord> chords = new ArrayList<>();

    @Min(1) @Max(6)
    @Column(name = "guitar_string_idx")
    private int idx;

    public GuitarString(int idx) {
        this.idx = idx;
    }

}
