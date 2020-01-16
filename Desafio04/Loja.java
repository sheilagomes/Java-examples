package desafio04;

import java.util.List;

public class Loja {
    private String nome;
    private String cnpj;
    private List<Livro> livros;
    private List<VideoGame> games;

    public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> games) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.livros = livros;
        this.games = games;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public List<VideoGame> getGames() {
        return games;
    }

    public void setGames(List<VideoGame> games) {
        this.games = games;
    }

    public void listaLivros() {
        System.out.println("A loja " + this.getNome() + " possui estes livros para venda:");
        for(Livro element : livros) {
           System.out.println(element.toString());
        }
        
    }
    
    public void listaVideoGames() {
        System.out.println("A loja " + this.getNome() + " possui estes video-games para venda:");
        for(VideoGame element : games) {
           System.out.println(element.toString());
        }
    }
    
    public void calculaPatrimonio() {
        double total = 0;
        for(Produto element : games) {
           total += element.getPreço() * element.getQtd();
        }
        for(Produto element : livros) {
           total += element.getPreço() * element.getQtd();
        }
        System.out.println("O patrimônio da loja " + this.getNome() + " é de R$ " + total);
    }

    @Override
    public String toString() {
        return "Loja{" + "livros=" + livros + '}';
    }
    
    
}
