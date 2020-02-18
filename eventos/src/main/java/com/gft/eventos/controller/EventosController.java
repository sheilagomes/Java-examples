package com.gft.eventos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gft.eventos.model.Evento;
import com.gft.eventos.repository.Eventos;

@Controller
public class EventosController {
	
	@Autowired
	private Eventos eventos;
	
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
	
	@RequestMapping(value = "/evento", method = RequestMethod.POST)
	public String salvar(Evento evento) {
		eventos.save(evento);
		return "CadastroEvento";
	}
}