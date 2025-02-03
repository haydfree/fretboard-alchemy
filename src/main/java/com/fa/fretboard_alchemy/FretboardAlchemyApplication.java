package com.fa.fretboard_alchemy;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

import com.fa.fretboard_alchemy.entities.Chord;
import com.fa.fretboard_alchemy.repositories.ChordRepository;

@SpringBootApplication
public class FretboardAlchemyApplication implements CommandLineRunner {

    private final ChordRepository chordRepository;

    public FretboardAlchemyApplication(ChordRepository chordRepository) {
        this.chordRepository = chordRepository;
    }

	public static void main(String[] args) {
		SpringApplication.run(FretboardAlchemyApplication.class, args);
	}

    @Override
    public void run(String... args) {
        Chord cMajor = new Chord("C Major", "1-3-5");
        chordRepository.save(cMajor);

        Chord found = chordRepository.findByName("C Major");
        System.out.println("found chords: " + found.toString());
    }

}
