package com.ecamp.mvc.modelo;

import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Producto {
	
	private int id;
	private String nombre;
	private String descripcion;
	private int stock;
	private int precio;

}
