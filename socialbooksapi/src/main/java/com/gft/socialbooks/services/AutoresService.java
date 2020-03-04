package com.gft.socialbooks.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gft.socialbooks.domain.Autor;
import com.gft.socialbooks.repository.AutoresRepo;
import com.gft.socialbooks.services.exceptions.AutorExistenteException;
import com.gft.socialbooks.services.exceptions.AutorNaoEncontradoException;

@Service
public class AutoresService {
	
	@Autowired
	private AutoresRepo autoresRepo;
	
	public List<Autor> listar() {
		return autoresRepo.findAll();
	}
	
	public  Autor salvar(Autor autor) {
		if(autor.getId() != null) {
			Optional<Autor> a = autoresRepo.findById(autor.getId());
			
			if(a != null) {
				throw new AutorExistenteException("O autor já existe.");
			}
		}
		return autoresRepo.save(autor);
	}
	
	public Autor buscar(Long id) {
		Optional<Autor> autor = autoresRepo.findById(id);
		if(!autor.isPresent()) {
			throw new AutorNaoEncontradoException("Não foi possível encontrar o autor.");
		}
		return autor.get();
	}
}
