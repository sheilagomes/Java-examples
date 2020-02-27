package com.gft.eventos.model;

public enum GeneroOpcoes {

	GENERO1("Alternativo"),
	GENERO2("Pop"),
	GENERO3("Rock"),
	GENERO4("Axé"),
	GENERO5("Blues"),
	GENERO6("Country"),
	GENERO7("Eletrônica"),
	GENERO8("Forró"),
	GENERO9("Funk"),
	GENERO10("Hip Hop"),
	GENERO11("Jazz"),
	GENERO12("MPB"),
	GENERO13("Música clássica"),
	GENERO14("Pagode"),
	GENERO15("Rap"),
	GENERO16("Reggae"),
	GENERO17("Samba"),
	GENERO18("Sertanejo");
	
	private String estilo;

	private GeneroOpcoes(String estilo) {
		this.estilo = estilo;
	}

	public String getEstilo() {
		return estilo;
	}		
}
