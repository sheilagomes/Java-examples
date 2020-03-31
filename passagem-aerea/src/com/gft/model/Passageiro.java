package com.gft.model;

public class Passageiro {
	
	private String nome;
	private TipoPassageiro tipo;
	
	public Passageiro(String nome, TipoPassageiro tipo) {
		super();
		this.nome = nome;
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoPassageiro getTipo() {
		return tipo;
	}

	public void setTipo(TipoPassageiro tipo) {
		this.tipo = tipo;
	}
	
	
}
