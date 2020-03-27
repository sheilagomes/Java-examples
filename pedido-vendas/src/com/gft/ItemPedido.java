package com.gft;

public class ItemPedido {
	private String descricao;
	private double valorUnitario;
	private int quantidade;

	public ItemPedido(String descricao, double valorUnitario, int quantidade) {
		this.descricao = descricao;
		this.valorUnitario = valorUnitario;
		this.quantidade = quantidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}