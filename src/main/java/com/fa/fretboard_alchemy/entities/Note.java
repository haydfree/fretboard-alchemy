package com.fa.fretboard_alchemy.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "notes")
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "note_name")
    private String name; 

    @ManyToMany
    private List<Scale> scales = new ArrayList<>();

    @ManyToMany
    private List<GuitarString> guitarStrings = new ArrayList<>();

    @ManyToMany
    private List<Fret> frets = new ArrayList<>();

    @ManyToMany
    private List<Chord> chords = new ArrayList<>();

    public Note(String name) {
        this.name = name;
    }
}
