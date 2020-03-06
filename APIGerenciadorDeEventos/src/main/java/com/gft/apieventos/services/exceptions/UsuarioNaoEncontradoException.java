package com.gft.apieventos.services.exceptions;

public class UsuarioNaoEncontradoException extends RuntimeException {
	
	private static final long serialVersionUID = 7363685145834789029L;

	public UsuarioNaoEncontradoException(String mensagem) {
		super(mensagem);
	}
	
	public UsuarioNaoEncontradoException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}
}