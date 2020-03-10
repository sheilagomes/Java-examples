package com.gft.apifinal.resources;

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

import com.gft.apifinal.domain.Evento;
import com.gft.apifinal.services.EventoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api(tags = "Eventos")
@RestController
@RequestMapping("/api/eventos") 
public class EventoResources {
	
	@Autowired
	private EventoService eventoService;
	
	@ApiOperation("Lista todos os eventos")
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Evento>> listar() {
		return ResponseEntity.status(HttpStatus.OK).body(eventoService.listar());
	}
	
	@ApiOperation("Salva um evento")
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> salvar(@ApiParam(name="corpo", value="Representação do evento") @Valid @RequestBody Evento evento) {
		evento = eventoService.salvar(evento);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(evento.getId()).toUri();
		
		return ResponseEntity.created(uri).build();
	}
	
	@ApiOperation("Busca um evento por ID")
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> buscar(@ApiParam(value="ID do evento", example = "1") @PathVariable("id") Long id ) {
		Optional<Evento> evento = eventoService.buscar(id);
		
		CacheControl cacheControl = CacheControl.maxAge(20, TimeUnit.SECONDS);
		
		return ResponseEntity.status(HttpStatus.OK).cacheControl(cacheControl).body(evento);
	}
	
	@ApiOperation("Atualiza um evento")
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void> atualizar(@ApiParam(name="corpo", value="Representação do evento") @RequestBody Evento evento, @ApiParam(value="ID do evento", example = "1") @PathVariable("id") Long id) {
		evento.setId(id);
		eventoService.atualizar(evento);
		return ResponseEntity.noContent().build();
	}
	
	@ApiOperation("Exclui um evento")
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> excluir(@ApiParam(value="ID do evento", example = "1") @PathVariable("id") Long id ) {
		eventoService.excluir(id);
		return ResponseEntity.noContent().build();
	}
	
	@ApiOperation("Lista todos os eventos em ordem alfabética crescente por capacidade")
	@RequestMapping(value = "/capacidade/asc", method = RequestMethod.GET)
	public ResponseEntity<List<Evento>> listarCapacidadeASC() {
		return ResponseEntity.status(HttpStatus.OK).body(eventoService.listarCapacidadeASC());
	}
	
	@ApiOperation("Lista todos os eventos em ordem alfabética decrescente por capacidade")
	@RequestMapping(value = "/capacidade/desc", method = RequestMethod.GET)
	public ResponseEntity<List<Evento>> listarCapacidadeDESC() {
		return ResponseEntity.status(HttpStatus.OK).body(eventoService.listarCapacidadeDESC());
	}

	@ApiOperation("Lista todos os eventos em ordem alfabética crescente por data")
	@RequestMapping(value = "/data/asc", method = RequestMethod.GET)
	public ResponseEntity<List<Evento>> listarDataASC() {
		return ResponseEntity.status(HttpStatus.OK).body(eventoService.listarDataASC());
	}
	
	@ApiOperation("Lista todos os eventos em ordem alfabética decrescente por data")
	@RequestMapping(value = "/data/desc", method = RequestMethod.GET)
	public ResponseEntity<List<Evento>> listarDataDESC() {
		return ResponseEntity.status(HttpStatus.OK).body(eventoService.listarDataDESC());
	}
	
	@ApiOperation("Lista todos os eventos em ordem alfabética crescente por nome")
	@RequestMapping(value = "/nome/asc", method = RequestMethod.GET)
	public ResponseEntity<List<Evento>> listarNomeASC() {
		return ResponseEntity.status(HttpStatus.OK).body(eventoService.listarNomeASC());
	}
	
	@ApiOperation("Lista todos os eventos em ordem alfabética decrescente por nome")
	@RequestMapping(value = "/nome/desc", method = RequestMethod.GET)
	public ResponseEntity<List<Evento>> listarNomeDESC() {
		return ResponseEntity.status(HttpStatus.OK).body(eventoService.listarNomeDESC());
	}
	
	@ApiOperation("Lista todos os eventos em ordem alfabética crescente por preço")
	@RequestMapping(value = "/preco/asc", method = RequestMethod.GET)
	public ResponseEntity<List<Evento>> listarPrecoASC() {
		return ResponseEntity.status(HttpStatus.OK).body(eventoService.listarPrecoASC());
	}
	
	@ApiOperation("Lista todos os eventos em ordem alfabética decrescente por preço")
	@RequestMapping(value = "/preco/desc", method = RequestMethod.GET)
	public ResponseEntity<List<Evento>> listarPrecoDESC() {
		return ResponseEntity.status(HttpStatus.OK).body(eventoService.listarPrecoDESC());
	}
}