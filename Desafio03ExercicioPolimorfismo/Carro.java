package desafio03exerciciopolimorfismo;
public class Carro extends Veiculo {
    private String marca;
    private int portas;
    private int ano;

    public Carro(String mar, int por, int ano, String mod, int vel, int pas, int com) {
        super(mod, vel, pas, com);
        this.marca = mar;
        this.portas = por;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public void abastecer(int qtd) {
        this.setCombustivel(this.getCombustivel() + qtd);
        System.out.println("Este carro agora está com " + this.getCombustivel() + " litros de combustivel");
    }
    
    @Override
    public void acelerar() {
        this.setVelocidade(this.getVelocidade() + 20);
        System.out.println("Este carro agora está rodando a " + this.getVelocidade() + "km/h");
    }

    @Override
    public String toString() {
        return "Carro{" + "marca=" + marca + ", portas=" + portas + ", ano=" + ano + '}';
    }
    
    
}
