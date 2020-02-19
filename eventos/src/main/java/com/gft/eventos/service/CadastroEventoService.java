package com.gft.eventos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.gft.eventos.model.Evento;
import com.gft.eventos.repository.Eventos;
import com.gft.eventos.repository.filter.EventoFilter;

import com.gft.eventos.model.CasaOpcoes;
import com.gft.eventos.model.GeneroOpcoes;
import com.gft.eventos.repository.filter.EventoFilter;

@Service
public class CadastroEventoService {
	
	@Autowired
	private Eventos eventos;
//	
	public void salvar(Evento evento) {
		try {
			eventos.save(evento);
		} catch (DataIntegrityViolationException e) {
			throw new IllegalArgumentException("Formato de data inválida");
		}
	}
	
	public void excluir(Long id) {
		eventos.deleteById(id);
	}

//	public String receber(Long codigo) {
//		Titulo titulo = titulos.findById(codigo).get();
//		titulo.setStatus(StatusTitulo.RECEBIDO);
//		titulos.save(titulo);
//		return StatusTitulo.RECEBIDO.getDescricao();
//	}

//	public List<Evento> filtrar(EventoFilter filtro) {
//		String nome = filtro.getNome() == null ? "" : filtro.getNome();
//		return eventos.findByNomeContaining(nome);
//	}
}
