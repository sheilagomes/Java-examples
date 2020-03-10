package com.gft.apieventos.handler;

import javax.servlet.http.HttpServletRequest;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.gft.apieventos.domain.DetalhesErro;
import com.gft.apieventos.services.exceptions.CasaExistenteException;
import com.gft.apieventos.services.exceptions.CasaNaoEncontradaException;
import com.gft.apieventos.services.exceptions.EventoExistenteException;
import com.gft.apieventos.services.exceptions.EventoNaoEncontradoException;
import com.gft.apieventos.services.exceptions.UsuarioExistenteException;
import com.gft.apieventos.services.exceptions.UsuarioNaoEncontradoException;
import com.gft.apieventos.services.exceptions.VendaExistenteException;
import com.gft.apieventos.services.exceptions.VendaNaoEncontradaException;

@ControllerAdvice
public class ResourceExceptionHandler {
	
	@ExceptionHandler(EventoNaoEncontradoException.class)
	public ResponseEntity<DetalhesErro> handleEventoNaoEncontradoException (EventoNaoEncontradoException e, HttpServletRequest request) {
		
		DetalhesErro erro = new DetalhesErro();
		erro.setStatus(404l);
		erro.setTitulo("Não foi possível encontrar o evento.");
		erro.setMensDev("http://erros.apieventos.com/404");
		erro.setTimestamp(System.currentTimeMillis());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erro);
	}
	
	@ExceptionHandler(CasaNaoEncontradaException.class)
	public ResponseEntity<DetalhesErro> handleCasaNaoEncontradaException (CasaNaoEncontradaException e, HttpServletRequest request) {
		
		DetalhesErro erro = new DetalhesErro();
		erro.setStatus(404l);
		erro.setTitulo("Não foi possível encontrar a casa.");
		erro.setMensDev("http://erros.apieventos.com/404");
		erro.setTimestamp(System.currentTimeMillis());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erro);
	}
	
	@ExceptionHandler(UsuarioNaoEncontradoException.class)
	public ResponseEntity<DetalhesErro> handleUsuarioNaoEncontradoException (UsuarioNaoEncontradoException e, HttpServletRequest request) {
		
		DetalhesErro erro = new DetalhesErro();
		erro.setStatus(404l);
		erro.setTitulo("Não foi possível encontrar o usuário.");
		erro.setMensDev("http://erros.apieventos.com/404");
		erro.setTimestamp(System.currentTimeMillis());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erro);
	}
	
	@ExceptionHandler(VendaNaoEncontradaException.class)
	public ResponseEntity<DetalhesErro> handleVendaNaoEncontradaException (VendaNaoEncontradaException e, HttpServletRequest request) {
		
		DetalhesErro erro = new DetalhesErro();
		erro.setStatus(404l);
		erro.setTitulo("Não foi possível encontrar a venda.");
		erro.setMensDev("http://erros.apieventos.com/404");
		erro.setTimestamp(System.currentTimeMillis());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erro);
	}
	
	@ExceptionHandler(EventoExistenteException.class)
	public ResponseEntity<DetalhesErro> handleEventoExistenteException (EventoExistenteException e, HttpServletRequest request) {
		
		DetalhesErro erro = new DetalhesErro();
		erro.setStatus(409l);
		erro.setTitulo("Evento já existente.");
		erro.setMensDev("http://erros.apieventos.com/409");
		erro.setTimestamp(System.currentTimeMillis());
		
		return ResponseEntity.status(HttpStatus.CONFLICT).body(erro);
	}
	
	@ExceptionHandler(CasaExistenteException.class)
	public ResponseEntity<DetalhesErro> handleCasaExistenteException (CasaExistenteException e, HttpServletRequest request) {
		
		DetalhesErro erro = new DetalhesErro();
		erro.setStatus(409l);
		erro.setTitulo("Casa já existente.");
		erro.setMensDev("http://erros.apieventos.com/409");
		erro.setTimestamp(System.currentTimeMillis());
		
		return ResponseEntity.status(HttpStatus.CONFLICT).body(erro);
	}	
	
	@ExceptionHandler(UsuarioExistenteException.class)
	public ResponseEntity<DetalhesErro> handleUsuarioExistenteException (UsuarioExistenteException e, HttpServletRequest request) {
		
		DetalhesErro erro = new DetalhesErro();
		erro.setStatus(409l);
		erro.setTitulo("Usuário já existente.");
		erro.setMensDev("http://erros.apieventos.com/409");
		erro.setTimestamp(System.currentTimeMillis());
		
		return ResponseEntity.status(HttpStatus.CONFLICT).body(erro);
	}
	
	@ExceptionHandler(VendaExistenteException.class)
	public ResponseEntity<DetalhesErro> handleVendaExistenteException (VendaExistenteException e, HttpServletRequest request) {
		
		DetalhesErro erro = new DetalhesErro();
		erro.setStatus(409l);
		erro.setTitulo("Venda já existente.");
		erro.setMensDev("http://erros.apieventos.com/409");
		erro.setTimestamp(System.currentTimeMillis());
		
		return ResponseEntity.status(HttpStatus.CONFLICT).body(erro);
	}

	@ExceptionHandler(DataIntegrityViolationException.class)
	public ResponseEntity<DetalhesErro> handleDataIntegrityViolationException (DataIntegrityViolationException e, HttpServletRequest request) {
		
		DetalhesErro erro = new DetalhesErro();
		erro.setStatus(400l);
		erro.setTitulo("Requisição inválida.");
		erro.setMensDev("http://erros.apieventos.com/400");
		erro.setTimestamp(System.currentTimeMillis());
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(erro);
	}
	
//	@ExceptionHandler(InternalServerErrorException.class)
//	public ResponseEntity<DetalhesErro> handleInternalServerErrorException (InternalServerErrorException  e, HttpServletRequest request) {
//		
//		DetalhesErro erro = new DetalhesErro();
//		erro.setStatus(500l);
//		erro.setTitulo("Erro interno do servidor.");
//		erro.setMensDev("http://erros.apieventos.com/500");
//		erro.setTimestamp(System.currentTimeMillis());
//		
//		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(erro);
//	}
}