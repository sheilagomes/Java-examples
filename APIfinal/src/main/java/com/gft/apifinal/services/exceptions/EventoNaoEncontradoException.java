package com.gft.apifinal.services.exceptions;

public class EventoNaoEncontradoException extends RuntimeException {

	private static final long serialVersionUID = 7363685145834789029L;

	public EventoNaoEncontradoException(String mensagem) {
		super(mensagem);
	}
	
	public EventoNaoEncontradoException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}
}