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

@Data @NoArgsConstructor
@Entity
@Table(name = "scales")
public class Scale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "scale_name")
    private String name;

    @Column(name = "scale_formula")
    private String formula;

    public Chord(String name, String formula) {
        this.name = name;
        this.formula = formula;
    }
}
