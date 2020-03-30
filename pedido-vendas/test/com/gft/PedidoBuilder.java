package com.gft;

import com.gft.desconto.CalculadoraDescontoPrimeiraFaixa;
import com.gft.desconto.CalculadoraDescontoSegundaFaixa;
import com.gft.desconto.CalculadoraDescontoTerceiraFaixa;
import com.gft.desconto.CalculadoraFaixaDesconto;
import com.gft.desconto.SemDesconto;

public class PedidoBuilder {
	
	private Pedido instancia;

	public PedidoBuilder() {
		CalculadoraFaixaDesconto calculadoraFaixaDesconto = 
				new CalculadoraDescontoTerceiraFaixa(
						new CalculadoraDescontoSegundaFaixa(
								new CalculadoraDescontoPrimeiraFaixa(
										new SemDesconto(null))));
		
		instancia = new Pedido(calculadoraFaixaDesconto);
	}
	
	public PedidoBuilder comItem(double valorUnitario, int quantidade) {
		instancia.adicionarItem(new ItemPedido("Gerado", valorUnitario, quantidade));
		return this;
	}
	
	public Pedido construir() {
		return instancia;
	}
	
}
