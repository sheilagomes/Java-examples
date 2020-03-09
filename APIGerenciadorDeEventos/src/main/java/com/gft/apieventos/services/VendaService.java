package com.gft.apieventos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gft.apieventos.domain.Venda;
import com.gft.apieventos.repository.Vendas;

@Service
public class VendaService {

	@Autowired
	private Vendas vendas;
	
	public List<Venda> listar() {
	return vendas.findAll();
	}
	
	public Optional<Venda> buscar(Long id) {
	Optional<Venda> venda = vendas.findById(id);

	return venda;
	}
}