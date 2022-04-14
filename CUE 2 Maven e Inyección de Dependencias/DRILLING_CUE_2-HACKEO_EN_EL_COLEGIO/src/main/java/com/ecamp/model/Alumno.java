package com.ecamp.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@AllArgsConstructor
@Getter
@Setter
@ToString
public class Alumno {
	private String rut;
	 private String nombre;
	 private List<Integer> notas;
	 private Float promedio;
	 
	 
	 
}



