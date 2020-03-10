package com.gft.apieventos.resources;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.gft.apieventos.domain.Casa;
import com.gft.apieventos.services.CasaService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api(tags = "Casas")
@RestController
@RequestMapping("/api/casas")
public class CasaResources {

	@Autowired
	private CasaService casaService;
	
	@ApiOperation("Lista todas as casas.")
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Casa>> listar() {
		return ResponseEntity.status(HttpStatus.OK).body(casaService.listar());
	}
	
	@ApiOperation("Salva uma casa.")
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> salvar(@ApiParam(name="corpo", value="Representação da casa") @Valid @RequestBody Casa casa) {
		casa = casaService.salvar(casa);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id)").buildAndExpand(casa.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@ApiOperation("Busca uma casa pelo ID.")
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Casa> buscar(@ApiParam(value="ID da casa", example = "1") @PathVariable("id") Long id) {	
		Casa casa = casaService.buscar(id);
		return ResponseEntity.status(HttpStatus.OK).body(casa);
	}
	
	@ApiOperation("Busca uma casa pelo nome.")
	@RequestMapping(value = "/nome/{nome}", method = RequestMethod.GET)
	public ResponseEntity<Casa> buscarNome(@ApiParam(value="Nome da casa", example = "Arena") @PathVariable("nome") String nome) {
		Casa casa = casaService.buscarNome(nome);
		return ResponseEntity.status(HttpStatus.OK).body(casa);
	}
	
	@ApiOperation("Atualiza uma casa.")
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void> atualizar(@ApiParam(name="corpo", value="Representação da casa") @RequestBody Casa casa, @ApiParam(value="ID da casa", example = "1") @PathVariable("id") Long id) {
		casa.setId(id);
		casaService.atualizar(casa);
		return ResponseEntity.noContent().build();
	}
	
	@ApiOperation("Exclui uma casa.")
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> excluir(@ApiParam(value="ID da casa", example = "1") @PathVariable("id") Long id ) {
		casaService.excluir(id);
		return ResponseEntity.noContent().build();
	}
	
	@ApiOperation("Lista todas as casas em ordem alfabética crescente por nome")
	@RequestMapping(value = "/asc", method = RequestMethod.GET)
	public ResponseEntity<List<Casa>> listarNomeASC() {
		return ResponseEntity.status(HttpStatus.OK).body(casaService.listarNomeASC());
	}
	
	@ApiOperation("Lista todas as casas em ordem alfabética decrescente por nome")
	@RequestMapping(value = "/desc", method = RequestMethod.GET)
	public ResponseEntity<List<Casa>> listarNomeDESC() {
		return ResponseEntity.status(HttpStatus.OK).body(casaService.listarNomeDESC());
	}
}