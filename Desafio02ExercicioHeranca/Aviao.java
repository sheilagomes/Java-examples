package desafio02exercicioheranca;
public class Aviao extends Veiculo {
    private String tipo;
    private String uso;

    public Aviao(String tipo, String uso, String mod, int vel, int pas, int com) {
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

    @Override
    public String toString() {
        return "Aviao{" + "tipo=" + tipo + ", uso=" + uso + '}';
    }
    
    
}
