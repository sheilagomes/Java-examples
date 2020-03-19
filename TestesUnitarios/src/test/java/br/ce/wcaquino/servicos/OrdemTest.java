package br.ce.wcaquino.servicos;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OrdemTest {
	
	public static int contador = 0;
	
	@Test
	public void inicia() {
		contador = 1;
	}
	
	@Test
	public void verifica() {
		Assert.assertEquals(1, contador);
	}

}