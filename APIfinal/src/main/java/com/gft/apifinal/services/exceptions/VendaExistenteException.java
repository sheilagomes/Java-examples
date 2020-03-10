package com.gft.apifinal.services.exceptions;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;

public class VendaExistenteException extends RuntimeException {
	
	private static final long serialVersionUID = 7363685145834789029L;

	public VendaExistenteException(String mensagem) {
		super(mensagem);
	}
	
	public VendaExistenteException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}
}