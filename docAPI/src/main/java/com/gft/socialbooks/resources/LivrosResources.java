package com.gft.socialbooks.resources;

import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.CacheControl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.gft.socialbooks.domain.Comentario;
import com.gft.socialbooks.domain.Livro;
import com.gft.socialbooks.services.LivroService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api(tags = "Livros")
@RestController
@RequestMapping("/livros") 
public class LivrosResources {
	
	@Autowired
	private LivroService livroService;
	
	@ApiOperation("Lista todos os livros")
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Livro>> listar() {
		return ResponseEntity.status(HttpStatus.OK).body(livroService.listar());
	}
	
	@ApiOperation("Salva um livro")
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> salvar(@ApiParam(name="corpo", value="Representação do livro") @Valid @RequestBody Livro livro) {
		livro = livroService.salvar(livro);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(livro.getId()).toUri();
		
		return ResponseEntity.created(uri).build();
	}
	
	@ApiOperation("Busca um livro por ID")
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> buscar(@ApiParam(value="ID do livro", example = "1") @PathVariable("id") Long id ) {
		Optional<Livro> livro = livroService.buscar(id);
		
		CacheControl cacheControl = CacheControl.maxAge(20, TimeUnit.SECONDS);
		
		return ResponseEntity.status(HttpStatus.OK).cacheControl(cacheControl).body(livro);
	}
	
	@ApiOperation("Exclui um livro")
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> excluir(@ApiParam(value="ID do livro", example = "1") @PathVariable("id") Long id ) {
		livroService.excluir(id);
		return ResponseEntity.noContent().build();
	}
	
	@ApiOperation("Atualiza um livro")
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void> atualizar(@ApiParam(name="corpo", value="Representação do livro") @RequestBody Livro livro, @ApiParam(value="ID do livro", example = "1") @PathVariable("id") Long id) {
		livro.setId(id);
		livroService.atualizar(livro);
		return ResponseEntity.noContent().build();
	}
	
	@ApiOperation("Cria um comentário em um livro")
	@RequestMapping(value = "/{id}/comentarios", method = RequestMethod.POST)
	public ResponseEntity<Void> fazerComentario(@ApiParam(value="ID do livro", example = "1") @PathVariable("id") Long livroId, @ApiParam(name="corpo", value="Representação do comentário") @RequestBody Comentario comentario) {
		livroService.salvarComentario(livroId, comentario);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().build().toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@ApiOperation("Lista os comentários de um livro")
	@RequestMapping(value = "/{id}/comentarios", method = RequestMethod.GET)
	public ResponseEntity<List<Comentario>> listarComentarios(@ApiParam(value="ID do livro", example = "1") @PathVariable("id")Long livroId) {
		List<Comentario> comentarios = livroService.listarComentarios(livroId);
		return ResponseEntity.status(HttpStatus.OK).body(comentarios);		
	}
}