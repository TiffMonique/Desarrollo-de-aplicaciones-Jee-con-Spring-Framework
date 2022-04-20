package com.ecamp.bibliotecaspring;

import java.util.List;

public interface IAyudante {
	public List<Libro> buscarLibro(String frase);
	 //se obtinenen libros segun la frase buscada en el nombre,autor, editorial, genero, etc.
	 public List<Libro> obtenerLibros();
	 //Se obtienen todos los libros de la biblioteca
	 public void agregarLibro(Libro libro);
	 //se agrega un nuevo libro a la biblioteca
	 public Libro cambiarDisponibilidad(int id);
	 //Disponible: disponible = true, Prestado disponible = false

}
