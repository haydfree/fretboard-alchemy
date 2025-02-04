package com.fa.fretboard_alchemy.entities;

import jakarta.persistence.*;
import lombok.*;

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
    private Scale[] scales;

    @ManyToMany
    private GuitarString[] guitarStrings;

    @ManyToMany
    private Fret[] frets;

    @ManyToMany
    private Chord[] chords;

    public Note(String name) {
        this.name = name;
    }
}
