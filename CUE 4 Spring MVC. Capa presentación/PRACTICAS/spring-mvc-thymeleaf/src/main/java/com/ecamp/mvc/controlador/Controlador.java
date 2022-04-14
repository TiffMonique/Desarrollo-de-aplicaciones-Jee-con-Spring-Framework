package com.ecamp.mvc.controlador;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ecamp.mvc.modelo.Usuario;

@Controller
@RequestMapping("/controlador")
public class Controlador {
	
	@RequestMapping("/hola")
	public ModelAndView inicio() {
		ModelAndView modelAndView = new ModelAndView("hola-usuario");
		Usuario usuario = new Usuario("Juan");
		modelAndView.addObject("user", usuario);
		return modelAndView;
		
	}

}
