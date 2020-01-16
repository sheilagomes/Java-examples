package desafio03exerciciopolimorfismo;
public class Caminhao extends Veiculo {
    private String tipo;
    private String uso;

    public Caminhao(String tipo, String uso, String mod, int vel, int pas, int com) {
        super(mod, vel, pas, com);
        this.tipo = tipo;
        this.uso = uso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }
    
    public void abastecer(float qtd) {
        this.setCombustivel((int) (this.getCombustivel() + qtd));
        System.out.println("Este caminhão agora está com " + this.getCombustivel() + " litros de combustivel");
    }
    
    @Override
    public void acelerar() {
        this.setVelocidade(this.getVelocidade() + 20);
        System.out.println("Este caminhão agora está rodando a " + this.getVelocidade() + "km/h");
    }

    @Override
    public String toString() {
        return "Caminhao{" + "tipo=" + tipo + ", uso=" + uso + '}';
    }
    
    
}
