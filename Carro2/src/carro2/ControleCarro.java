package carro2;
public class ControleCarro implements TelaCarro {
    private String marca;
    private String modelo;
    private String placa;
    private String cor;
    private float km;
    private boolean isLigado;
    private int litrosCombustivel;
    private int velocidade;
    private double preco;
    
    public ControleCarro() {
        this.km = 0;
        this.isLigado = false;
        this.velocidade = 0;
        this.litrosCombustivel = 0;
    }

    private String getMarca() {
        return marca;
    }

    private void setMarca(String marca) {
        this.marca = marca;
    }

    private String getModelo() {
        return modelo;
    }

    private void setModelo(String modelo) {
        this.modelo = modelo;
    }

    private String getPlaca() {
        return placa;
    }

    private void setPlaca(String placa) {
        this.placa = placa;
    }

    private String getCor() {
        return cor;
    }

    private void setCor(String cor) {
        this.cor = cor;
    }

    private float getKm() {
        return km;
    }

    private void setKm(float km) {
        this.km = km;
    }

    private boolean isIsLigado() {
        return isLigado;
    }

    private void setIsLigado(boolean isLigado) {
        this.isLigado = isLigado;
    }

    private int getLitrosCombustivel() {
        return litrosCombustivel;
    }

    private void setLitrosCombustivel(int litrosCombustivel) {
        this.litrosCombustivel = litrosCombustivel;
    }

    private int getVelocidade() {
        return velocidade;
    }

    private void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    private double getPreco() {
        return preco;
    }

    private void setPreco(double preco) {
        this.preco = preco;
    }
    
    public void acelerar() {
        if (this.isLigado) {
            setKm(getKm() + 20);
            setLitrosCombustivel(getLitrosCombustivel() - 1);
        } else {
            System.out.println("Não é possível acelerar com o carro desligado.");
        }
    }
    
    public void abastecer(int qtdLitros) {
        if (qtdLitros > 100) {
            System.out.println("O tanque só recebe 100 litros");
        } else {
            setLitrosCombustivel(getLitrosCombustivel() + qtdLitros);
        }
    }
        
    public void frear() {
        if (this.isIsLigado() && this.getVelocidade() > 0) {
            this.setKm(getKm() - 10);
        } else {
            System.out.println("Não é possível frear com o carro desligado ou parado.");
        }
    }
        
    public void pintar(String corNova) {
        this.setCor(corNova);
    }

    public void ligar() {
        if (this.isIsLigado()) {
            System.out.println("O carro já está ligado.");
        } else {
            this.setIsLigado(true);
        }
    }
        
    public void desligar() {
        if (this.isIsLigado()) {
            this.setIsLigado(false);
            System.out.println("O carro foi desligado.");
        } else {
            System.out.println("O carro já está desligado.");
        }
    }
}
