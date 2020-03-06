package com.gft.apieventos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gft.apieventos.domain.Casa;
import com.gft.apieventos.repository.Casas;
import com.gft.apieventos.services.exceptions.CasaExistenteException;
import com.gft.apieventos.services.exceptions.CasaNaoEncontradaException;

@Service
public class CasaService {
		
		@Autowired
		private Casas casas;

		public List<Casa> listar() {
		return casas.findAll();
		}		

		public  Casa salvar(Casa casa) {
			if(casa.getId() != 0L) {
				Optional<Casa> a = casas.findById(casa.getId());
				
				if(a != null) {
					throw new CasaExistenteException("A casa já existe.");
				}
			}
			return casas.save(casa);
		}
//		public void salvar(Casa casa) {
//			casas.save(casa);
//		}
		
		public void excluir(Long id) {
			casas.deleteById(id);
		}
		
		public Casa buscar(Long id) {
			Optional<Casa> casa = casas.findById(id);
			if(!casa.isPresent()) {
				throw new CasaNaoEncontradaException("Não foi possível encontrar a casa.");
			}
			return casa.get();
		}
}