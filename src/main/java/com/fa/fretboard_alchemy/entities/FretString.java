package com.fa.fretboard_alchemy.entities;

// JPA imports
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

// Lombok imports
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "fret_strings")
public class FretString {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "frets")
    private Fret fret;

    @Column(name = "strings")
    private GuitarString guitarString;

    @Column(name = "notes")
    private Note note;

    public FretString(Fret fret, GuitarString guitarString, Note note) {
        this.fret = fret;
        this.guitarString = guitarString;
        this.note = note;
    }
}
