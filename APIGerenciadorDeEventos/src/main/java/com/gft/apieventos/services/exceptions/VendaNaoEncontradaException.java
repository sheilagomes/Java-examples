package com.gft.apieventos.services.exceptions;

public class VendaNaoEncontradaException extends RuntimeException {
	
	private static final long serialVersionUID = 7363685145834789029L;

	public VendaNaoEncontradaException(String mensagem) {
		super(mensagem);
	}
	
	public VendaNaoEncontradaException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}
}