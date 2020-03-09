package com.gft.apieventos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gft.apieventos.domain.Usuario;
import com.gft.apieventos.repository.Usuarios;
import com.gft.apieventos.services.exceptions.UsuarioNaoEncontradoException;

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