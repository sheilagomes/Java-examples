package com.gft.estudo.model;

public enum StatusRegistro {
	
	PENDENTE("Pendente"),
	INICIADO("Iniciado"),
	CONCLUIDO("Concluído");
	
	private String descricao;
	
	StatusRegistro(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}

}
