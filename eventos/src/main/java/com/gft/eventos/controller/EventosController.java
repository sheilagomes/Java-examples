package com.gft.eventos.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gft.eventos.model.Casa;
import com.gft.eventos.model.CasaOpcoes;
import com.gft.eventos.model.Evento;
import com.gft.eventos.model.GeneroOpcoes;
import com.gft.eventos.repository.Eventos;
import com.gft.eventos.repository.filter.EventoFilter;
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
	
	@RequestMapping("/novo/casa")
	public ModelAndView novaCasa() {
		ModelAndView mv = new ModelAndView("CadastroCasa");
		mv.addObject(new Casa());
		return mv;
	}
	
	@RequestMapping("/novo/evento")
	public ModelAndView novaEvento() {
		ModelAndView mv = new ModelAndView("CadastroEvento");
		mv.addObject(new Evento());
		return mv;
	}
	
	@RequestMapping("/casa")
	public ModelAndView pesquisaCasa() {
		List<Casa> todasCasas = casas.findAll();
		ModelAndView mv = new ModelAndView("CadastroCasa");
		mv.addObject("casas", todasCasas);
		return mv;
	}
	
	@RequestMapping("/evento")
	public ModelAndView pesquisar() {
		List<Evento> todosEventos = eventos.findAll();
		ModelAndView mv = new ModelAndView("CadastroEvento");
		mv.addObject("eventos", todosEventos);
		return mv;
	}
	
	@RequestMapping(value = "/casa", method = RequestMethod.POST)
	public ModelAndView salvaCasa(@Validated Casa casa, Errors errors) {		
		ModelAndView mv = new ModelAndView("CadastroCasa");
		if (errors.hasErrors()) {
			return mv;
		}
//			return CADASTRO_VIEW;
//		}
//		try {
//			cadastroTituloService.salvar(titulo);
//			attributes.addFlashAttribute("mensagem", "Título salvo!");
//			return "redirect:/titulos/novo";
//		} catch (IllegalArgumentException e) {
//			errors.rejectValue("dataVencimento", null, "Formato de data inválido");
//			return CADASTRO_VIEW;
//		}
		casas.save(casa);
		mv.addObject("mensagem", "Casa salva!");
		return mv;
	}
	
	@RequestMapping(value = "/evento", method = RequestMethod.POST)
	public ModelAndView salvar(@Validated Evento evento, Errors errors) {		
		ModelAndView mv = new ModelAndView("CadastroEvento");
		if (errors.hasErrors()) {
			return mv;
		}
		
//		return CADASTRO_VIEW;
//	}
//	try {
//		cadastroTituloService.salvar(titulo);
//		attributes.addFlashAttribute("mensagem", "Título salvo!");
//		return "redirect:/titulos/novo";
//	} catch (IllegalArgumentException e) {
//		errors.rejectValue("dataVencimento", null, "Formato de data inválido");
//		return CADASTRO_VIEW;
//	}
		eventos.save(evento);
		mv.addObject("mensagem", "Evento salvo!");
		return mv;
	}
	
//	@RequestMapping(value="excluir/{id}", method = RequestMethod.GET)
//	public String excluir(@PathVariable Long id, RedirectAttributes attributes) {
//		cadastroTituloService.excluir(id);
//		attributes.addFlashAttribute("mensagem", "Evento excluído!");
//		return "redirect:/evento";
//	}
	
//	public RedirectView salvar(Evento evento) {
//	eventos.save(evento);//		
//	return new RedirectView("http://localhost:8080/evento");
	
//	@RequestMapping(method = RequestMethod.POST)
//	public String salvar(@Validated Titulo titulo, Errors errors, RedirectAttributes attributes) {
//		if (errors.hasErrors()) {
//			return CADASTRO_VIEW;
//		}
//		try {
//			cadastroTituloService.salvar(titulo);
//			attributes.addFlashAttribute("mensagem", "Título salvo!");
//			return "redirect:/titulos/novo";
//		} catch (IllegalArgumentException e) {
//			errors.rejectValue("dataVencimento", null, "Formato de data inválido");
//			return CADASTRO_VIEW;
//		}
//	}
	
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
//@Controller
//@RequestMapping("/titulos")
//public class TituloController {
//	
//	private static final String CADASTRO_VIEW = "CadastroTitulo";
//	
//	@Autowired
//	private CadastroTituloService cadastroTituloService;  
//	
//	@RequestMapping("/novo")
//	public ModelAndView novo() {
//		ModelAndView mv = new ModelAndView(CADASTRO_VIEW);
//		mv.addObject(new Titulo());
//		return mv;
//	}
//	
//	@RequestMapping(method = RequestMethod.POST)
//	public String salvar(@Validated Titulo titulo, Errors errors, RedirectAttributes attributes) {
//		if (errors.hasErrors()) {
//			return CADASTRO_VIEW;
//		}
//		try {
//			cadastroTituloService.salvar(titulo);
//			attributes.addFlashAttribute("mensagem", "Título salvo!");
//			return "redirect:/titulos/novo";
//		} catch (IllegalArgumentException e) {
//			errors.rejectValue("dataVencimento", null, "Formato de data inválido");
//			return CADASTRO_VIEW;
//		}
//	}
//	
//	@RequestMapping
//	public ModelAndView pesquisar(@ModelAttribute("filtro") TituloFilter filtro) {
//		List<Titulo> todosTitulos = cadastroTituloService.filtrar(filtro);
//		ModelAndView mv = new ModelAndView("PesquisaTitulos");
//		mv.addObject("titulos", todosTitulos);
//		return mv;
//	}
//	
//	@RequestMapping("{codigo}")
//	public ModelAndView edicao(@PathVariable("codigo") Titulo titulo) {
//		ModelAndView mv = new ModelAndView(CADASTRO_VIEW);
//		mv.addObject(titulo);
//		return mv;		
//	}
//	
//	@RequestMapping(value="excluir/{codigo}", method = RequestMethod.GET)
//	public String excluir(@PathVariable Long codigo, RedirectAttributes attributes) {
//		cadastroTituloService.excluir(codigo);
//		attributes.addFlashAttribute("mensagem", "Título excluído!");
//		return "redirect:/titulos";
//	}
//	
//	@ModelAttribute("todosStatusTitulo")
//	public List<StatusTitulo> todosStatusTitulo() {
//		return Arrays.asList(StatusTitulo.values());
//	}
//}


