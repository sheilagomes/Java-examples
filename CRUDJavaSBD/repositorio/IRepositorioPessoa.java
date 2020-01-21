package repositorio;

import java.util.List;

import entidades.Pessoa;

public interface IRepositorioPessoa {

	public boolean salvaPessoa(Pessoa pessoa);
	public boolean deletarPessoaPorID(int id);
	public List<Pessoa> listarPessoa();
	public boolean alteraPessoa(Pessoa pessoa);
	
}