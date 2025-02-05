package com.fa.fretboard_alchemy.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.*;

@Data @NoArgsConstructor
@Entity
@Table(name = "scales")
public class Scale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "scale_name")
    private String name;
    
    @ManyToMany
    private List<Note> notes = new ArrayList<>();

    @ManyToMany
    private List<GuitarString> guitarStrings = new ArrayList<>();

    @ManyToMany
    private List<Fret> frets = new ArrayList<>();

    @OneToMany
    private List<Chord> chords = new ArrayList<>();

    private String key;
    private String scaleType;

    public Scale(String key, String scaleType) {
        this.key = key;
        this.scaleType = scaleType;
        this.name = key + " " + scaleType;
    }
}
