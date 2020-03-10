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

import com.gft.apifinal.domain.Venda;
import com.gft.apifinal.services.VendaService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api(tags = "Vendas")
@RestController
@RequestMapping("/api/vendas")
public class VendasResources {

	@Autowired
	private VendaService vendaService;

	@ApiOperation("Lista todas as vendas.")
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Venda>> listar() {
		return ResponseEntity.status(HttpStatus.OK).body(vendaService.listar());
	}

	@ApiOperation("Busca uma venda pelo ID.")
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> buscar(@ApiParam(value = "ID da venda", example = "1") @PathVariable("id") Long id) {
		Optional<Venda> venda = vendaService.buscar(id);

		CacheControl cacheControl = CacheControl.maxAge(20, TimeUnit.SECONDS);

		return ResponseEntity.status(HttpStatus.OK).cacheControl(cacheControl).body(venda);
	}
}