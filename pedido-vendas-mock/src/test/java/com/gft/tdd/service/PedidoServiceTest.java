package com.gft.tdd.service;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.gft.tdd.email.NotificadorEmail;
import com.gft.tdd.model.Pedido;
import com.gft.tdd.model.builder.PedidoBuilder;
import com.gft.tdd.repository.Pedidos;
import com.gft.tdd.sms.NotificadorSms;

public class PedidoServiceTest {
	
	private PedidoService pedidoService;
	
	@Mock
	private Pedidos pedidos;
	
	@Mock
	private NotificadorEmail notificadorEmail;
	
	@Mock
	private NotificadorSms notificadorSms;
	
	private Pedido pedido;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		
		List<AcaoLancamentoPedido> acoes = Arrays.asList(pedidos, notificadorEmail, notificadorSms);
		pedidoService = new PedidoService(acoes);
		pedido = new PedidoBuilder()
					.comValor(100.0)
					.para("João", "joao@joao.com", "9999-0000")
					.construir();
	}
	
	@Test
	public void deveCalcularOImposto() throws Exception {

		double imposto = pedidoService.lancar(pedido);
		assertEquals(10.0, imposto, 0.0001);
	}
	
	@Test
	public void deveSalvarPedidoNoBancoDeDados() throws Exception {		
		pedidoService.lancar(pedido);
		Mockito.verify(pedidos).executar(pedido);
	}
	
	@Test
	public void deveNotificarPorEmail() throws Exception {
		pedidoService.lancar(pedido);
		Mockito.verify(notificadorEmail).executar(pedido);
	}
	
	@Test
	public void deveNotificarPorSms() throws Exception {
		pedidoService.lancar(pedido);
		Mockito.verify(notificadorSms).executar(pedido);
	}
}
