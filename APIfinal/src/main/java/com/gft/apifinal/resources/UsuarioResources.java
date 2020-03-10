package com.gft.apifinal.resources;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.CacheControl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gft.apifinal.domain.Usuario;
import com.gft.apifinal.services.UsuarioService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api(tags = "Usuarios")
@RestController
@RequestMapping("/api/users")
public class UsuarioResources {
	@Autowired
	private UsuarioService usuarioService;
	
	@ApiOperation("Lista todos os usuários.")
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Usuario>> listar() {
		return ResponseEntity.status(HttpStatus.OK).body(usuarioService.listar());
	}
	
	@ApiOperation("Busca um usuário pelo ID.")
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> buscar(@ApiParam(value="ID do usuario", example = "1") @PathVariable("id") Long id ) {
		Optional<Usuario> usuario = usuarioService.buscar(id);
		
		CacheControl cacheControl = CacheControl.maxAge(20, TimeUnit.SECONDS);
		
		return ResponseEntity.status(HttpStatus.OK).cacheControl(cacheControl).body(usuario);
	}
}
