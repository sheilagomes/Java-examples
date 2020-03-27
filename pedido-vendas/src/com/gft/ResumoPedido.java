package com.gft;

public class ResumoPedido {
	
	private double valorTotal;
	
	private double desconto;

	public ResumoPedido(double valorTotal, double desconto) {
		super();
		this.valorTotal = valorTotal;
		this.desconto = desconto;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	

}
