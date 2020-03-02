package com.gft.socialbooks.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gft.socialbooks.domain.Livro;
import com.gft.socialbooks.repository.LivrosRepo;

@RestController
@RequestMapping("/livros") 
public class LivrosResources {
	
	@Autowired
	private LivrosRepo livrosRepo;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Livro> listar() {
		return livrosRepo.findAll();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void salvar(@RequestBody Livro livro) {
		
	}

}
