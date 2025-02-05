package com.fa.fretboard_alchemy.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "chords")
public class Chord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    private List<Note> notes = new ArrayList<>();

    @ManyToOne
    private Scale scale; 

    @ManyToMany
    private List<Fret> frets = new ArrayList<>();

    @ManyToMany
    private List<GuitarString> guitarStrings = new ArrayList<>();

    @Column(name = "chord_key")
    private String key;

    @Column(name = "chord_type")
    private String chordType;

    @Column(name = "chord_name")
    private String name;

    public Chord(String key, String chordType) {
        this.key = key;
        this.chordType = chordType;
        this.name = key + " " + chordType;
    }

}
