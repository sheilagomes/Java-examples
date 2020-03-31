package com.gft.tdd.model.builder;

import com.gft.tdd.model.Cliente;
import com.gft.tdd.model.Pedido;

public class PedidoBuilder {
	
	private Pedido instancia;
	
	public PedidoBuilder() {
		instancia = new Pedido();
	}
	
	public Pedido construir() {
		return instancia;
	}
	
	public PedidoBuilder comValor(double valor) {
		instancia.setValor(valor);
		return this;
	}
	
	public PedidoBuilder para(String nome, String email, String telefone) {
		Cliente cliente = new Cliente(nome, email, telefone);
		instancia.setCliente(cliente);
		return this;
	}
}
