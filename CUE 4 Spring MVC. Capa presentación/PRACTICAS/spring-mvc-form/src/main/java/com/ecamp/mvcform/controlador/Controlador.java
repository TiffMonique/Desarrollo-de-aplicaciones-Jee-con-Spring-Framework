package com.ecamp.mvcform.controlador;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ecamp.mvcform.modelo.*;
@Controller
public class Controlador {
	
	List<Usuario> listaUsuarios= new ArrayList<Usuario>();
	@RequestMapping("/form")
	public ModelAndView mostrarFormulario() {
		ModelAndView modelAndView =new ModelAndView("formulario");
		return modelAndView;
	}

	@RequestMapping("/registrar")
	public ModelAndView registrarUsuario(@ModelAttribute("usuario") Usuario user) {
		ModelAndView modelAndView =new ModelAndView("registrado");
		listaUsuarios.add(user);
		modelAndView.addObject("usuario" , user);
		return modelAndView;
	}

	@RequestMapping("/usuarios")
	public ModelAndView mostarUsuarios() {
		ModelAndView modelAndView =new ModelAndView("usuarios");
		modelAndView.addObject("usuariosRegistrados" , listaUsuarios);
		return modelAndView;
	}
	
	
}
