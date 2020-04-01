package com.gft.tdd.service;

import java.util.List;

import com.gft.tdd.email.NotificadorEmail;
import com.gft.tdd.model.Pedido;
import com.gft.tdd.model.StatusPedido;
import com.gft.tdd.repository.Pedidos;
import com.gft.tdd.sms.NotificadorSms;

public class PedidoService {
	
	private List<AcaoLançamentoPedido> acoes;
	private Pedidos pedidos;

	public PedidoService(Pedidos pedidos, List<AcaoLançamentoPedido> acoes) {
		this.acoes = acoes;
		this.pedidos = pedidos;
	}

	public double lancar(Pedido pedido) {
		double imposto = pedido.getValor() * 0.1;
		
		for (AcaoLançamentoPedido acao : acoes) {
			acao.executar(pedido);
		}
//		acoes.forEach(a -> a.executar(pedido));
		return imposto;
	}

	public Pedido pagar(Long codigo) {
		Pedido pedido = pedidos.buscarPeloCodigo(codigo);
		
		if (!pedido.getStatus().equals(StatusPedido.PENDENTE))
			throw new StatusPedidoInvalidoException();
		
		pedido.getStatus(StatusPedido.PAGO);
		return pedido;
	}

}
