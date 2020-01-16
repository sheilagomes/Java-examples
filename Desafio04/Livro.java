package desafio04;
public class Livro extends Produto {
    private String auto;
    private String tema;
    private int qtdPag;

    public Livro(String nome, double preço, int qtd, String auto, String tema, int qtdPag) {
        super(nome, preço, qtd);
        this.auto = auto;
        this.tema = tema;
        this.qtdPag = qtdPag;
    }

    public String getAuto() {
        return auto;
    }

    public void setAuto(String auto) {
        this.auto = auto;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getQtdPag() {
        return qtdPag;
    }

    public void setQtdPag(int qtdPag) {
        this.qtdPag = qtdPag;
    }
    
    public void calculaImposto() {
        if (this.getTema() == "educativo") {
            System.out.println("Livros educativo não tem imposto: " + this.getNome() + ".");
        } else {
            double imp = this.getPreço() * 0.1d;
            System.out.println("R$ " + imp + " de impostos sobre o livro " + this.getNome() + ".");
        }
    }
    
    @Override
    public String toString() {
        return "Título: " + this.getNome() + ", pre\u00e7o: " + this.getPreço() + ", quantidade: " + this.getQtd() + " em estoque.";
    }
    
}
