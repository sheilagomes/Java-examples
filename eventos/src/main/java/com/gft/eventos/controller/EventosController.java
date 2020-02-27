package com.gft.eventos.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.gft.eventos.model.Casa;
import com.gft.eventos.model.CasaOpcoes;
import com.gft.eventos.model.Evento;
import com.gft.eventos.model.GeneroOpcoes;
import com.gft.eventos.repository.Eventos;
import com.gft.eventos.repository.filter.EventoFilter;
import com.gft.eventos.service.CadastroEventoService;
import com.gft.eventos.repository.Casas;
import com.gft.eventos.repository.filter.CasaFilter;

@Controller
public class EventosController {
	
	@Autowired
	private Eventos eventos;
	
	@Autowired
	private Casas casas;
	
	@RequestMapping("/home")
	public String home() {
		return "index";
	}
	
//	@GetMapping("/evento")
//	public String listaCasa(Casa casa,Evento evento){
//	    casamodel.addAttribute("casas",eventos.findAll());
//	    return "listaCasa";
//	}
	
	@RequestMapping("/casa")
	public ModelAndView pesquisaCasa() {
		List<Casa> todasCasas = casas.findAll();
		ModelAndView mv = new ModelAndView("CadastroCasa");
		Casa casa = new Casa();
		mv.addObject(casa);
		mv.addObject("casas", todasCasas);
		return mv;
	}
	
	@RequestMapping("/evento")
	public ModelAndView pesquisar() {
		List<Evento> todosEventos = eventos.findAll();
		ModelAndView mv = new ModelAndView("CadastroEvento");
		Evento evento = new Evento();
		mv.addObject(evento);
		mv.addObject("eventos", todosEventos);
		List<Casa> todasCasas = casas.findAll();
		mv.addObject("casaShow", todasCasas);
		return mv;
	}
	
	@RequestMapping(value = "/casa", method = RequestMethod.POST)
	public String salvaCasa(@Validated Casa casa, Errors errors, RedirectAttributes attributes) {	
		if (errors.hasErrors()) {
			return "CadastroCasa";
		}
		casas.save(casa);
		attributes.addFlashAttribute("mensagem", "Casa salva!");
		return "redirect:/casa";
	}
	
	@RequestMapping(value = "/evento", method = RequestMethod.POST)
	public String salvaEvento(@Validated Evento evento, Errors errors, RedirectAttributes attributes) {
		if (errors.hasErrors()) {
			return "CadastroEvento";
		}
//		try {
//			CadastroEventoService.salvar(evento);
//			attributes.addFlashAttribute("mensagem", "Evento salvo!");
//			return "redirect:/evento";
//		} catch (IllegalArgumentException e) {
//			errors.rejectValue("dataVencimento", null, "Formato de data inválido");
//			return "CadastroEvento";
//		}
		eventos.save(evento);
		attributes.addFlashAttribute("mensagem", "Evento salvo!");
		return "redirect:/evento";
	}
	
	@RequestMapping("/evento/{id}")
	public ModelAndView editarEvento(@PathVariable("id") Evento evento) {
		ModelAndView mv = new ModelAndView("CadastroEvento");
		mv.addObject(evento);
		return mv;		
	}
	
	@RequestMapping("/casa/{id}")
	public ModelAndView editarCasa(@PathVariable("id") Casa casa) {
		ModelAndView mv = new ModelAndView("CadastroCasa");
		mv.addObject(casa);
		return mv;		
	}
	
	@RequestMapping(value="evento/excluir/{id}", method = RequestMethod.GET)
	public String excluirEvento(@PathVariable Long id, RedirectAttributes attributes) {
//		CadastroEventoService.excluir(id);
		eventos.deleteById(id);
		attributes.addFlashAttribute("mensagem", "Evento excluído!");
		return "redirect:/evento";
	}
	
	@RequestMapping(value="casa/excluir/{id}", method = RequestMethod.GET)
	public String excluirCasa(@PathVariable Long id, RedirectAttributes attributes) {
//		CadastroCasaService.excluir(id);
		casas.deleteById(id);
		attributes.addFlashAttribute("mensagem", "Casa excluída!");
		return "redirect:/casa";
	}
		
	@ModelAttribute("todasCasaOpcoes")
	public List<CasaOpcoes> todasCasaOpcoes() {
		return Arrays.asList(CasaOpcoes.values());
	}
	
	@ModelAttribute("todosGeneroOpcoes")
	public List<GeneroOpcoes> todosGeneroOpcoes() {
		return Arrays.asList(GeneroOpcoes.values());
	}
}

//package com.algaworks.cobranca.controller;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.dao.DataIntegrityViolationException;
//import org.springframework.stereotype.Controller;
//import org.springframework.validation.Errors;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;
//
//import com.algaworks.cobranca.model.StatusTitulo;
//import com.algaworks.cobranca.model.Titulo;
//import com.algaworks.cobranca.repository.Titulos;
//import com.algaworks.cobranca.repository.filter.TituloFilter;
//import com.algaworks.cobranca.service.CadastroTituloService;
//
//import groovyjarjarpicocli.CommandLine.Model;
//	
//	@RequestMapping
//	public ModelAndView pesquisar(@ModelAttribute("filtro") TituloFilter filtro) {
//		List<Titulo> todosTitulos = cadastroTituloService.filtrar(filtro);
//		ModelAndView mv = new ModelAndView("PesquisaTitulos");
//		mv.addObject("titulos", todosTitulos);
//		return mv;
//	}


