package com.gft.tdd.sms;

import com.gft.tdd.model.Pedido;
import com.gft.tdd.service.AcaoLançamentoPedido;

public class NotificadorSms implements AcaoLançamentoPedido {

	public void executar(Pedido pedido) {
		System.out.println("Enviando o sms...");
		
	}

}
