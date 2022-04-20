package com.ecamp.bibliotecaspring;

import java.util.ArrayList;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
@Component("ayudante")
public class Ayudante implements IAyudante {
	@Autowired
	
	Biblioteca biblioteca;

	@Override
	public List<Libro> buscarLibro(String frase) {
		List<Libro> libro = biblioteca.getLibro();
		List<Libro> librosEncontrados=new ArrayList<Libro>();
		for (int i = 0; i < libro.size(); i++) {
			if (libro.get(i).getTitulo().contains(frase)
					|| libro.get(i).getEditorial().getNombre().contains(frase)
					|| libro.get(i).getGenero().contains(frase)
					|| libro.get(i).getAutor().getNombre().contains(frase)) {
				
				librosEncontrados.add(libro.get(i));

		}}
		return librosEncontrados;
	}

	@Override
	public List<Libro> obtenerLibros() {
		List<Libro> libro = biblioteca.getLibro();

		return libro;
	}

	@Override
	public void agregarLibro(Libro libro) {
		List<Libro> libros = biblioteca.getLibro();
		libros.add(libro);
	}

	@Override
	public Libro cambiarDisponibilidad(int id) {
		Libro libro = null;
		int encontrado =0;
		for (int i = 0; i < biblioteca.getLibro().size(); i++) {
			libro = biblioteca.getLibro().get(i);
			if (libro.getId() == id && libro.isDisponible()) {
				libro.setDisponible(false);
				System.out.println("La Disponibilidad de libro ha sido cambiada");
				encontrado++;
				break;

			} else if(libro.getId() == id && !libro.isDisponible())  {
				libro.setDisponible(true);
				System.out.println("La Disponibilidad de libro ha sido cambiada");
				encontrado++;
				break;
			}
		};
		if(encontrado==0) {
			System.out.println("Libro no encontrado");
			
		}
		return libro;

	}

}
