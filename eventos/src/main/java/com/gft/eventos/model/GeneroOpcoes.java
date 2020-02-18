package com.gft.eventos.model;

public enum GeneroOpcoes {

	GENERO1("Alternativo"),
	GENERO2("Pop"),
	GENERO3("Rock");
	
	private String estilo;

	private GeneroOpcoes(String estilo) {
		this.estilo = estilo;
	}

	public String getEstilo() {
		return estilo;
	}		
}
