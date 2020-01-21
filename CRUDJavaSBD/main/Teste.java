package main;

import java.util.ArrayList;
import java.util.List;

import entidades.Pessoa;
import repositorio.RepositorioPessoa;

public class Teste {
	private static RepositorioPessoa rp = new RepositorioPessoa();

	public static void main(String[] args) {

		System.out.println("========== Ação 1 - Adicionar pessoa ==========");
                popularArray();
                System.out.println("========== Ação 2 - Listar pessoas ==========");
		listarPessoas();
                System.out.println("========== Ação 3 - Excluir pessoa ==========");
		rp.deletarPessoaPorID(2);
		System.out.println("========== Ação 4 - Listar pessoas ==========");
                listarPessoas();
                System.out.println("========== Ação 5 - Alterar pessoa ==========");
		alterar();
                System.out.println("========== Ação 6 - Listar pessoas ==========");
		listarPessoas();
	}
	
	public static void alterar(){
		
		Pessoa pessoa = new Pessoa();
                pessoa.setId(3);
                pessoa.setNome("Zenaide");
		pessoa.setProf("Vendedor");
		pessoa.setNacionalidade("Brasil");
		rp.alteraPessoa(pessoa);
	}

	public static void popularArray() {

		Pessoa pessoa1 = new Pessoa();
                pessoa1.setId(1);
		pessoa1.setNome("Maria");
		pessoa1.setProf("Professora");
		pessoa1.setSexo("F");
                pessoa1.setPeso(45.0f);
                pessoa1.setAltura(1.70f);
                pessoa1.setNacionalidade("Portugal");
		rp.salvaPessoa(pessoa1);

		Pessoa pessoa2 = new Pessoa();
                pessoa2.setId(2);
		pessoa2.setNome("Marta");
		pessoa2.setProf("Programadora");
		pessoa2.setSexo("F");
                pessoa2.setPeso(55.7f);
                pessoa2.setAltura(1.53f);
                pessoa2.setNacionalidade("França");
		rp.salvaPessoa(pessoa2);

		Pessoa pessoa = new Pessoa();
		pessoa.setId(3);
                pessoa.setNome("Mario");
		pessoa.setProf("Motorista");
		pessoa.setSexo("M");
                pessoa.setPeso(85.3f);
                pessoa.setAltura(1.83f);
                pessoa.setNacionalidade("EUA");
		rp.salvaPessoa(pessoa);

	}

	public static void listarPessoas() {

		List<Pessoa> lista = new ArrayList<Pessoa>();

		lista = rp.listarPessoa();

		for (Pessoa pessoa : lista) {

			System.out.println("Id : " + pessoa.getId());
			System.out.println("Nome : " + pessoa.getNome());
			System.out.println("Profissao : " + pessoa.getProf());
			System.out.println("Sexo : " + pessoa.getSexo());
                        System.out.println("Peso : " + pessoa.getPeso());
                        System.out.println("Altura : " + pessoa.getAltura());
                        System.out.println("País : " + pessoa.getNacionalidade());
			System.out.println("--------------------------------------");

		}

	}

}
