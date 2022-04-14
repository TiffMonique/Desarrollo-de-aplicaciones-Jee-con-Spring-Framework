package com.ecamp.ayudandoAlProfesorConSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Component

public class Profesor {
	
	
	@Autowired
	private ICalculadora calculadora;
	public void mostrarAlumnosConPromedios() {
		System.out.println(calculadora.calcularPromedios());
	}

	
	
}
