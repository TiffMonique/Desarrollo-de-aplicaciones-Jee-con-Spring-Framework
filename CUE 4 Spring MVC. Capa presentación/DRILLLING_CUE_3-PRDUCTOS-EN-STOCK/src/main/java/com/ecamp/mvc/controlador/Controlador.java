package com.ecamp.mvc.controlador;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.ecamp.mvc.modelo.Producto;


@Controller
public class Controlador {
	
	List<Producto> listaProductos= new ArrayList<Producto>();
	@GetMapping("/producto/agregar")
	public ModelAndView mostrarFormulario() {
		ModelAndView modelAndView =new ModelAndView();
		modelAndView.setViewName("agregar");
		return modelAndView;
	}

	@PostMapping("/producto/procesar")
	public RedirectView registrarProducto(@ModelAttribute("producto") Producto product) {
		listaProductos.add(product);
		
		return  new RedirectView("/producto/mostrar");
	}

	@GetMapping("/producto/mostrar")
	public ModelAndView mostarProdcutos() {
		ModelAndView modelAndView =new ModelAndView();
		modelAndView.setViewName("mostrar");
		modelAndView.addObject("productosRegistrados" , listaProductos);
		return modelAndView;
	}

}
