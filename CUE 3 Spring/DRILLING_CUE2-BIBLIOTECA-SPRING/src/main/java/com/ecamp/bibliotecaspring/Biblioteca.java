package com.ecamp.bibliotecaspring;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
@Configuration
public class Biblioteca {
	
	@Bean
	public List<Libro> getLibro(){
		
		List<Libro> libro = new ArrayList<Libro>();
		return libro;
		
	}


}
