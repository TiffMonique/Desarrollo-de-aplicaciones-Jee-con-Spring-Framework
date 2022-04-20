package com.ecamp.bibliotecaspring;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class DrillingCue2BibliotecaSpringApplication implements CommandLineRunner{
	
	public static void main(String[] args) {
		
		SpringApplication.run(DrillingCue2BibliotecaSpringApplication.class, args);
		
		
	}
	@Qualifier("bibliotecario")
	@Autowired
	Bibliotecario bibliotecario;
		public void run(String... args) throws Exception {
		Autor autor1=new Autor( "John","Green");
		Autor autor2=new Autor( "Paulo","Coelho");
		Autor autor3=new Autor( "Dan","Brown");
		Autor autor4=new Autor( "Stephenie","Meyer");
		Editorial editorial = new Editorial ("Guaymuras", "Honduras");
		
		Libro libro1= new Libro(1, "Buscando a Alaska",autor1, editorial,128, "Romance",true );
		Libro libro2= new Libro(2, " El Código da Vinci",autor2, editorial,128, "Aventura",false );
		
		Libro libro3= new Libro(3, "Buscando a Alaska",autor3, editorial,128, "Ficcion",true );
		Libro libro4= new Libro(4, "Crepúsculo",autor4, editorial,128, "Romance",false );
		
		
		System.out.println("====================AGREGANDO LIBROS=======================");
		bibliotecario.agregarUnLibro(libro1);
		bibliotecario.agregarUnLibro(libro2);
		bibliotecario.agregarUnLibro(libro3);
		bibliotecario.agregarUnLibro(libro4);
		System.out.println("==========================================================\n");
		
		
		System.out.println("================CAMBIANDO DISPONIBILIDAD==================");
		bibliotecario.devolucionOPrestamoDeLibro(1);
		bibliotecario.devolucionOPrestamoDeLibro(7);
		System.out.println("==========================================================\n");
		
		
		System.out.println("====================BUSCANDO LIBROS=======================");
		bibliotecario.buscarLibro("Crepúsculo");
		bibliotecario.buscarLibro("John");
		System.out.println("==========================================================\n");
		
		System.out.println("====================LISTAR LIBROS=======================");
		bibliotecario.solicitanTodosLosLibros();
		System.out.println("==========================================================\n");
		
	}

}
