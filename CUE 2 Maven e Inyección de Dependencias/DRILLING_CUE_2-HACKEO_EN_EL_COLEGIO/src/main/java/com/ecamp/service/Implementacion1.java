package com.ecamp.service;

import java.util.ArrayList;

import java.util.List;

import com.ecamp.model.Alumno;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@AllArgsConstructor
@Getter
@Setter
@ToString
public class Implementacion1 implements ICalculadora{
	ArrayList<Alumno> alumnos;

	

	@Override
	public List<Alumno> calcularPromedios() {
		System.out.println("==========================================================================");
		System.out.println("calcular los promedios de cada alumno considerando todas sus notas");
		System.out.println("==========================================================================");
		for (Alumno alumno : alumnos) { // Obtenemos el alumno
			float acum = 0f; // Acumulador
			int count = 0; // Contador
			for (int i = 0; i < alumno.getNotas().size(); i++) { // accedemos a lista
				acum += alumno.getNotas().get(i);// sumamos notas
				count++;
			}
			alumno.setPromedio(acum / count); // Entregamos promedio a alumno
		}
		
		return alumnos;
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
