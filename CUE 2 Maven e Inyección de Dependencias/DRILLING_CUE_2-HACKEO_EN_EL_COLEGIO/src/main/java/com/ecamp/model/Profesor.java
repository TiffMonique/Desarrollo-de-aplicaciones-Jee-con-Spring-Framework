package com.ecamp.model;

import com.ecamp.service.ICalculadora;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString


public class Profesor {
	ICalculadora calculadora;

	public void calcular() {
		
		

		for(Alumno alumno: calculadora.calcularPromedios()) {
			System.out.println(alumno.toString()+"\n");	
		
		}


	}

}
