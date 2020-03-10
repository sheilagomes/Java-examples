package com.gft.apifinal.services.exceptions;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;

public class UsuarioExistenteException extends RuntimeException {
	
	private static final long serialVersionUID = 7363685145834789029L;

	public UsuarioExistenteException(String mensagem) {
		super(mensagem);
	}
	
	public UsuarioExistenteException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}
}