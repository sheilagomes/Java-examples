package com.gft.socialbooks.services.exceptions;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;

public class AutorExistenteException  extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7363685145834789029L;

	public AutorExistenteException(String mensagem) {
		super(mensagem);
	}
	
	public AutorExistenteException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}
}