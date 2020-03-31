package com.gft.service;

import com.gft.model.Passageiro;
import com.gft.model.TipoPassageiro;
import com.gft.model.Voo;

public class PrecoPassagemService {
	
	public double calcular(Passageiro passageiro, Voo voo) {
		return passageiro.getTipo().getCalculadora().calcular(voo);
	}
}
