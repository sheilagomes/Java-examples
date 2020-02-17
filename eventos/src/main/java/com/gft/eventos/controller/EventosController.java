package com.gft.eventos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventosController {
	
	@RequestMapping("/home")
	public String getIndex() {
		return "index";
	}
	
	@RequestMapping("/casa")
	public String getCadastroCasa() {
		return "CadastroCasa";
	}
	
	@RequestMapping("/evento")
	public String getCadastroEvento() {
		return "CadastroEvento";
	}
}