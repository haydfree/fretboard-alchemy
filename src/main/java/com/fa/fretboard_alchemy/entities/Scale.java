package com.fa.fretboard_alchemy.entities;

import jakarta.persistence.*;
import lombok.*;

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
    private Note[] notes;

    @ManyToMany
    private GuitarString[] guitarStrings;

    @ManyToMany
    private Fret[] frets;

    @OneToMany
    private Chord[] chords;

    private String key;
    private String scaleType;

    public Scale(String key, String scaleType) {
        this.key = key;
        this.scaleType = scaleType;
        this.name = key + " " + scaleType;
    }
}
