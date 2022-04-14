package com.ecamp.service;

import java.util.ArrayList;
import java.util.Collections;
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
public class Implementacion3 implements ICalculadora{
	ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
	

	/*Una debe calcular los promedios sin considerar la nota más alta y la
nota más baja*/
	public List<Alumno> calcularPromedios() {
		System.out.println("===================================================================================");
		System.out.println("Calcular los promedios sin considerar la nota más alta y la nota más baja");
		System.out.println("==========================================================================");
		for (Alumno alumno : alumnos) { // Obtenemos el alumno
			float acum = 0f; // Acumulador
			int count = 0; // Contador
			List<Integer> array = alumno.getNotas();
			Collections.sort(array);
			int n = array.size();
			for (int i = 1; i <n-1; i++) { // accedemos a lista
				
					acum += alumno.getNotas().get(i);// sumamos notas
					count++;	
			
			}
			alumno.setPromedio(acum / count); // Entregamos promedio a alumno
		}
		return alumnos;
	}

}
