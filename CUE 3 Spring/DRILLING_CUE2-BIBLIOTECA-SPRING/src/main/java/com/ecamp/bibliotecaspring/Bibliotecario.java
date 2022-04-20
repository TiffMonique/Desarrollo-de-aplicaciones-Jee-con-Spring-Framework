package com.ecamp.bibliotecaspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
@Component("bibliotecario")
public class Bibliotecario {
	@Autowired
	@Qualifier("ayudante")
	IAyudante ayudante;

	public void solicitanTodosLosLibros() {
		// ordenar al ayudante entregar la lista de todos los libros
		// imprimir por pantalla el resultado de lo ordenado (como ud.Desee)
		for (Libro libro : ayudante.obtenerLibros()) {
			System.out.println(libro);

		}

	}

	public void agregarUnLibro(Libro libro) {
		// ordenar al ayudante a agregar un libro a la biblioteca
		// imprimir por pantalla el resultado de lo ordenado (como ud.Desee)
		ayudante.agregarLibro(libro);
		System.out.println("Libro agregado exitosamente");
	}

	public void devolucionOPrestamoDeLibro(int id) {
		// ordenar al ayudante a cambiar la disponibilidad de un libro por id
		// imprimir por pantalla el resultado de lo ordenado (como ud.Desee)
		ayudante.cambiarDisponibilidad(id);

	}

	public void buscarLibro(String frase) {
		// ayudante! busca una lista de libros según esta frase
		// imprimir por pantalla el resultado de lo ordenado (como ud.Desee)
		for (Libro libro : ayudante.buscarLibro(frase)) {
			System.out.println(libro);

		}
		

	}
}
