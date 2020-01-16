package carro2;
public class Carro2 {
    public static void main(String[] args) {
        ControleCarro c1 = new ControleCarro();
        c1.ligar();
        c1.abastecer(100);
        c1.acelerar();
        c1.frear();
        c1.pintar("azul");
        c1.desligar();
    }
    
}
