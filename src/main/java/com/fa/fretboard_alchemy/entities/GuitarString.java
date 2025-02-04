package com.fa.fretboard_alchemy.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "guitar_strings")
public class GuitarString {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    private Note[] notes;

    @ManyToMany
    private Scale[] scales;

    @ManyToMany
    private Fret[] frets;

    @ManyToMany
    private Chord[] chords;

    @Min(1) @Max(6)
    @Column(name = "guitar_string_idx")
    private int idx;

    public GuitarString(int idx) {
        this.idx = idx;
    }

}
