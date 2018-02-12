package br.com.guarulhosemdestaque.portalnoticia.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class AdminPanelController {

	@GetMapping("")
	public String index(){
		return "admin/painel";
	}
	
	@GetMapping("/adicionar-noticia")
	public ModelAndView adicionarNoticia(Model model){
		ModelAndView mv = new ModelAndView("admin/form-noticia");
		
		//mv.addObject()
		
	}

}
