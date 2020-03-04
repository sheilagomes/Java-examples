package com.gft.socialbooks.services.exceptions;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;

public class AutorNaoEncontradoException  extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7363685145834789029L;

	public AutorNaoEncontradoException(String mensagem) {
		super(mensagem);
	}
	
	public AutorNaoEncontradoException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}
}