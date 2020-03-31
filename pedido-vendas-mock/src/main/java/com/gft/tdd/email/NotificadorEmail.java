package com.gft.tdd.email;

import com.gft.tdd.model.Pedido;
import com.gft.tdd.service.AcaoLançamentoPedido;

public class NotificadorEmail implements AcaoLançamentoPedido {
	
	public void executar(Pedido pedido) {
		System.out.println("Enviando o e-mail...");
		
	}

}
