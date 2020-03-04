package com.gft.socialbooks.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.gft.socialbooks.domain.Comentario;
import com.gft.socialbooks.domain.Livro;
import com.gft.socialbooks.repository.ComentariosRepo;
import com.gft.socialbooks.repository.LivrosRepo;
import com.gft.socialbooks.services.exceptions.LivroNaoEncontradoException;

@Service
public class LivroService {
	
	@Autowired
	private LivrosRepo livrosRepo;
	
	@Autowired
	private ComentariosRepo comentariosRepo;
	
	public List<Livro> listar() {
		return livrosRepo.findAll();
	}
	
	public Optional<Livro> buscar(Long id) {
		Optional<Livro> livro = livrosRepo.findById(id);
		
		if(!livro.isPresent()) {
			throw new LivroNaoEncontradoException("Não foi possível encontrar o livro.");
		}

		return livro;
	}
	
	public Livro salvar(Livro livro) {
		livro.setId(null);
		return livrosRepo.save(livro);
	}
	
	public void excluir(Long id) {
		try {
			livrosRepo.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new LivroNaoEncontradoException("Não foi possível encontrar o livro.");
		}
	}
	
	public void atualizar(Livro livro) {
		verExiste(livro);
		livrosRepo.save(livro);
	}
	
	private void verExiste(Livro livro) {
		buscar(livro.getId());
	}
	
	public Comentario salvarComentario(Long livroId, Comentario comentario) {
		Optional<Livro> livro = buscar(livroId);
		if (livro.isPresent()) {
			comentario.setLivro(livro.get());	
		}
		comentario.setData(new Date());
		
		return comentariosRepo.save(comentario);
	}
	
	public List<Comentario> listarComentarios(Long livroId) {
		Optional<Livro> livro = buscar(livroId);		
		return livro.get().getComentarios();
	}

}
