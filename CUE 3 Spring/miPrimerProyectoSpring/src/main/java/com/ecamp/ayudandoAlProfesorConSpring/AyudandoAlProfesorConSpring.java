package com.ecamp.ayudandoAlProfesorConSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AyudandoAlProfesorConSpring  implements CommandLineRunner{
	@Autowired
	Profesor profesor;
	public static void main(String[] args) {
		SpringApplication.run(AyudandoAlProfesorConSpring.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		profesor.mostrarAlumnosConPromedios();
		
	}

}
