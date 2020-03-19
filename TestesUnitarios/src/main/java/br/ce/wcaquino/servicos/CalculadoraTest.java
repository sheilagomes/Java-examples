package br.ce.wcaquino.servicos;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.ce.wcaquino.exceptions.NaoPodeDividirPorZeroException;

public class CalculadoraTest {
	
	private Calculadora calc;
	
	@Before
	public void setup() {
		calc = new Calculadora();
	}
	
	@Test
	public void deveSomarDoisValores() {
		//cenario
		int a = 5;
		int b = 3;
		Calculadora calc = new Calculadora();
		
		//acao
		int resultado = calc.somar(a,b);
		
		//verificacao
		Assert.assertEquals(8, resultado);

	}
	
	@Test
	public void deveSubtrairDoisValores() {
		//cenario
		int a = 8;
		int b = 5;
		Calculadora calc = new Calculadora();
		
		//acao
		int resultado = calc.subtrair(a,b);
		
		//verificacao
		Assert.assertEquals(3, resultado);

	}
	
	@Test
	public void deveDividirDoisValores() throws NaoPodeDividirPorZeroException {
		//cenario
		int a = 8;
		int b = 4;
		Calculadora calc = new Calculadora();
		
		//acao
		int resultado = calc.dividir(a,b);
		
		//verificacao
		Assert.assertEquals(2, resultado);
	}
	
	@Test(expected = NaoPodeDividirPorZeroException.class)
	public void deveLancarExcecaoAoDividirPorZeroDividirDoisValores() throws NaoPodeDividirPorZeroException {
		int a = 10;
		int b = 0;
		Calculadora calc = new Calculadora();
		 
		calc.dividir(a,b);
	}
}
