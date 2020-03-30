package com.gft;

import java.util.ArrayList;
import java.util.List;

import com.gft.desconto.CalculadoraFaixaDesconto;

public class Pedido {
	
	private List<ItemPedido> itens = new ArrayList<>();
	
	private CalculadoraFaixaDesconto calculadoraFaixaDesconto;
	
	public Pedido(CalculadoraFaixaDesconto calculadoraFaixaDesconto) {
		this.calculadoraFaixaDesconto = calculadoraFaixaDesconto;
	}

	private void validarQuantidadeItens(ItemPedido itemPedido) {
		if (itemPedido.getQuantidade() < 0)
			throw new QuantidadeItensInvalidaException();
	}
	
	public void adicionarItem(ItemPedido itemPedido) {
		validarQuantidadeItens(itemPedido);
		
		itens.add(itemPedido);
	}
	
	public ResumoPedido resumo() {
		double valorTotal = itens.stream().mapToDouble(i -> i.getValorUnitario() * i.getQuantidade()).sum();
		double desconto = calculadoraFaixaDesconto.desconto(valorTotal);
		
		return new ResumoPedido(valorTotal, desconto);
	}
}
