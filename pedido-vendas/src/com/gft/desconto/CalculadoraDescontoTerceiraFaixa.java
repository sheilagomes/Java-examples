package com.gft.desconto;

public class CalculadoraDescontoTerceiraFaixa extends CalculadoraFaixaDesconto {
	
	public CalculadoraDescontoTerceiraFaixa(CalculadoraFaixaDesconto proximo) {
		super(proximo);
	}

	@Override
	protected double calcular(double valorTotal) {
		if (valorTotal > 1000.0)
			return valorTotal * 0.08;

		return -1;
	}

}
