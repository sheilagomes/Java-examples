package com.gft.apifinal.services.exceptions;

public class CasaNaoEncontradaException extends RuntimeException {
	
	private static final long serialVersionUID = 7363685145834789029L;

	public CasaNaoEncontradaException(String mensagem) {
		super(mensagem);
	}
	
	public CasaNaoEncontradaException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}
}