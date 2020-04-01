package com.gft.tdd.repository;

import com.gft.tdd.model.Pedido;
import com.gft.tdd.service.AcaoLançamentoPedido;

public class Pedidos implements AcaoLançamentoPedido {
	
	public void executar(Pedido pedido) {
		System.out.println("Salvando no banco de dados...");
		
	}
	
	public Pedido buscarPeloCodigo(Long codigo) {
		//Vai ao BD buscar pelo código
		return new Pedido();
	}
}
