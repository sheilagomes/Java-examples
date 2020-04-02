package com.gft.tdd.email;

import com.gft.tdd.model.Pedido;
import com.gft.tdd.service.AcaoLancamentoPedido;

public class NotificadorEmail implements AcaoLancamentoPedido {
	
	@Override
	public void executar(Pedido pedido) {
		System.out.println("Enviando o e-mail...");
	}
}
