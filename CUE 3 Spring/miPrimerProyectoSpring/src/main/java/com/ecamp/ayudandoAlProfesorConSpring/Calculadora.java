package com.ecamp.ayudandoAlProfesorConSpring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;



@AllArgsConstructor
@Data
@Component
public class Calculadora implements ICalculadora{
	
	@Autowired
	List<Alumno> alumnos;

	
	@Override
	public List<Alumno> calcularPromedios(){
		
		int index =0;
		for (Alumno alumnoTemp: alumnos) {
			Float sumaNotas =0f;
			int cantidadNotas =0;
			for (Integer nota :alumnoTemp.getNotas()) {
				sumaNotas += nota;
				cantidadNotas++;
			}
			
			alumnoTemp.setPromedio(sumaNotas/cantidadNotas);
			alumnos.set(index, alumnoTemp);
			index ++;
		}
		return alumnos;
		
	}
	
	
	
	
}
