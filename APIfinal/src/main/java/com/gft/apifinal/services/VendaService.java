package com.gft.apifinal.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gft.apifinal.domain.Venda;
import com.gft.apifinal.repository.Vendas;
import com.gft.apifinal.services.exceptions.VendaNaoEncontradaException;

@Service
public class VendaService {

	@Autowired
	private Vendas vendas;
	
	public List<Venda> listar() {
	return vendas.findAll();
	}
	
	public Optional<Venda> buscar(Long id) {
	Optional<Venda> venda = vendas.findById(id);
	if (!venda.isPresent()) {
		throw new VendaNaoEncontradaException("Não foi possível encontrar a venda.");
	}
	return venda;
	}
}