package com.gft.tdd.service;

import java.util.List;

import com.gft.tdd.model.Pedido;

public class PedidoService {
	
	private List<AcaoLancamentoPedido> acoes;

	public PedidoService(List<AcaoLancamentoPedido> acoes) {
		this.acoes = acoes;
	}

	public double lancar(Pedido pedido) {
		double imposto = pedido.getValor() * 0.1;
		
		for (AcaoLancamentoPedido acao : acoes) {
			acao.executar(pedido);
		}
//		acoes.forEach(a -> a.executar(pedido));
		return imposto;
	}
}
