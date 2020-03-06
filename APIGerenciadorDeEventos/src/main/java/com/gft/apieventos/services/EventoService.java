package com.gft.apieventos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.gft.apieventos.domain.Evento;
import com.gft.apieventos.repository.Eventos;
import com.gft.apieventos.services.exceptions.EventoNaoEncontradoException;

@Service
public class EventoService {

	@Autowired
	private Eventos eventos;
//	
//	@Autowired
//	private Vendas vendas;
	
	public List<Evento> listar() {
	return eventos.findAll();
	}
	
	public Optional<Evento> buscar(Long id) {
	Optional<Evento> evento = eventos.findById(id);
	
	if(!evento.isPresent()) {
		throw new EventoNaoEncontradoException("Não foi possível encontrar o evento.");
	}

	return evento;
}
	
	public Evento salvar(Evento evento) {
		try {
			eventos.save(evento);
		} catch (DataIntegrityViolationException e) {
			throw new IllegalArgumentException("Formato de data inválida");
		}
//		evento.setId(0L));
		return eventos.save(evento);
	}
	
	public void excluir(Long id) {
		try {
			eventos.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new EventoNaoEncontradoException("Não foi possível encontrar o evento.");
		}
	}
	
	public void atualizar(Evento evento) {
		verExiste(evento);
		eventos.save(evento);
	}
	
	private void verExiste(Evento evento) {
		buscar(evento.getId());
	}	
}