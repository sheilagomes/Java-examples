package com.gft.apieventos.services.exceptions;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;

public class EventoExistenteException extends RuntimeException {
	
	private static final long serialVersionUID = 7363685145834789029L;

	public EventoExistenteException(String mensagem) {
		super(mensagem);
	}
	
	public EventoExistenteException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}
}