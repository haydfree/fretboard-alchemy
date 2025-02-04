package com.fa.fretboard_alchemy.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "frets")
public class Fret {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    private GuitarString[] guitarStrings;

    @ManyToMany
    private Note[] notes;

    @ManyToMany
    private Chord[] chords;

    @ManyToMany
    private Scale[] scales;
   
    @Min(0) @Max(24)
    @Column(name = "fret_idx")
    private int idx;

    public Fret(int idx) {
        this.idx = idx;
    }

}
