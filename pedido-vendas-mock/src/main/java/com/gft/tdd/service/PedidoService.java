package com.gft.tdd.service;

import java.util.List;

import com.gft.tdd.email.NotificadorEmail;
import com.gft.tdd.model.Pedido;
import com.gft.tdd.repository.Pedidos;
import com.gft.tdd.sms.NotificadorSms;

public class PedidoService {
	
	private List<AcaoLançamentoPedido> acoes;

	public PedidoService(List<AcaoLançamentoPedido> acoes) {
		this.acoes = acoes;
	}

	public double lancar(Pedido pedido) {
		double imposto = pedido.getValor() * 0.1;
		
		for (AcaoLançamentoPedido acao : acoes) {
			acao.executar(pedido);
		}
//		acoes.forEach(a -> a.executar(pedido));
		return imposto;
	}

}
