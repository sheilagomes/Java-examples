package desafio04;
public abstract class Produto {
    private String nome;
    private double preço;
    private int qtd;

    public Produto(String nome, double preço, int qtd) {
        this.nome = nome;
        this.preço = preço;
        this.qtd = qtd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
}
    

