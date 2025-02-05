package com.fa.fretboard_alchemy;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;

import com.fa.fretboard_alchemy.entities.*;
import com.fa.fretboard_alchemy.repositories.*;
import com.fa.fretboard_alchemy.services.*;

@SpringBootApplication
public class FretboardAlchemyApplication implements CommandLineRunner {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FretboardAlchemyApplication.class, args);

        NoteService ns = context.getBean(NoteService.class);
        ns.createNotes();
        ns.printNotes();
	}

    @Override
    public void run(String... args) {

    }

}
