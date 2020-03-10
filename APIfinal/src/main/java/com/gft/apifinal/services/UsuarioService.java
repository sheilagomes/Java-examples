package com.gft.apifinal.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gft.apifinal.domain.Usuario;
import com.gft.apifinal.repository.Usuarios;
import com.gft.apifinal.services.exceptions.UsuarioNaoEncontradoException;

@Service
public class UsuarioService {

	@Autowired
	private Usuarios usuarios;

	public List<Usuario> listar() {
		return usuarios.findAll();
	}

	public Optional<Usuario> buscar(Long id) {
		Optional<Usuario> usuario = usuarios.findById(id);

		if (!usuario.isPresent()) {
			throw new UsuarioNaoEncontradoException("Não foi possível encontrar o usuário.");
		}

		return usuario;
	}
}