package com.ecamp.bibliotecaspring;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Libro {
	
	private int id;
	private String titulo;
	private Autor autor;
	private Editorial editorial;
	private int pagina;
	private String genero;
	private boolean disponible;

}
