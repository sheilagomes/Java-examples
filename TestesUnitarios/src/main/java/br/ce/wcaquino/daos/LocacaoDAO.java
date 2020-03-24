package br.ce.wcaquino.daos;

import java.util.List;

import br.ce.wcaquino.entidades.Locacao;

public interface LocacaoDAO {
	
	public void salvar(Locacao locacao);

	public List<Locacao> obterLocacoesPendentes();
}
