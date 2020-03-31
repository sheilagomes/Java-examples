package com.gft.model;

public class Voo {
	
	private String origem;
	private String destino;
	private double preco;
	
	public Voo(String origem, String destino, double preco) {
		super();
		this.origem = origem;
		this.destino = destino;
		this.preco = preco;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}
