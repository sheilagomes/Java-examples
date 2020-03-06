package com.gft.apieventos.services.exceptions;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;

public class CasaExistenteException extends RuntimeException {

	private static final long serialVersionUID = 7363685145834789029L;

	public CasaExistenteException(String mensagem) {
		super(mensagem);
	}
	
	public CasaExistenteException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}
}