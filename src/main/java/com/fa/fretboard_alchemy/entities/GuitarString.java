package com.fa.fretboard_alchemy.entities;

// JPA imports
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

// Lombok imports
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "guitar_strings")
public class GuitarString {

    @Id
    @Min(1) @Max(6)
    private int idx;

    public GuitarString(int idx) {
        this.idx = idx;
    }
}
