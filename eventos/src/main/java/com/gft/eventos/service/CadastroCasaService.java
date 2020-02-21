package com.gft.eventos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.gft.eventos.model.Casa;
import com.gft.eventos.model.CasaOpcoes;
import com.gft.eventos.repository.Casas;
import com.gft.eventos.repository.filter.CasaFilter;

@Service
public class CadastroCasaService {
	
	@Autowired
	private Casas casas;
//	
	public void salvar(Casa casa) {
		casas.save(casa);
	}
	
	public void excluir(Long id) {
		casas.deleteById(id);
	}

//	public List<Casa> filtrar(CasaFilter filtro) {
//		String nome = filtro.getNome() == null ? "" : filtro.getNome();
//		return eventos.findByNomeContaining(nome);
//	}
}