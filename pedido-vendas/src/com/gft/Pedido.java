package com.gft;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	
	private List<ItemPedido> itens = new ArrayList<>();

	public void adicionarItem(ItemPedido itemPedido) {
		itens.add(itemPedido);
	}
	
	public ResumoPedido resumo() {
		double valorTotal = itens.stream().mapToDouble(i -> i.getValorUnitario() * i.getQuantidade()).sum();
		double desconto = 0;
		
		if (valorTotal > 300.0) {
			desconto = valorTotal * 0.04;
		}
		
		return new ResumoPedido(valorTotal, desconto);
	}
}
