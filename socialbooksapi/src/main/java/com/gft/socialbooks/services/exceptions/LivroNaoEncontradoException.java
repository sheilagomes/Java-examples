package com.gft.socialbooks.services.exceptions;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;

public class LivroNaoEncontradoException  extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7363685145834789029L;

	public LivroNaoEncontradoException(String mensagem) {
		super(mensagem);
	}
	
	public LivroNaoEncontradoException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}
}