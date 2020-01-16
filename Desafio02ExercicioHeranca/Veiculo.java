package desafio02exercicioheranca;
public class Veiculo {
    private String modelo;
    private int velocidade;
    private int passageiros;
    private int combustivel;

    public Veiculo(String mod, int vel, int pas, int com) {
        this.modelo = mod;
        this.velocidade = vel;
        this.passageiros = pas;
        this.combustivel = com;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }

    public int getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(int combustivel) {
        this.combustivel = combustivel;
    }

    @Override
    public String toString() {
        return "Veiculo{" + "modelo=" + modelo + ", velocidade=" + velocidade + ", passageiros=" + passageiros + ", combustivel=" + combustivel + '}';
    }
}
