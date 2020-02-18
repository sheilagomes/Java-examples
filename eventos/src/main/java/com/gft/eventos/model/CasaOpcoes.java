package com.gft.eventos.model;

public enum CasaOpcoes {
	
	CASA1("Casa 1"),
	CASA2("Casa 2"),
	CASA3("Casa 3");
	
	private String nome;

	private CasaOpcoes(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}		
}
