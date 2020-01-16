package desafio03exerciciopolimorfismo;
public class Desafio03ExercicioPolimorfismo {
    public static void main(String[] args) {
        Veiculo v = new Veiculo("Volkswagen", 150, 5, 100);
        Carro c = new Carro("Gol", 4, 2020, "Volkswagen", 150, 5, 100);
        Aviao a = new Aviao("1", "Comercial", "Volkswagen", 150, 5, 100);
        Caminhao k = new Caminhao("1", "Comercial", "Volkswagen", 150, 5, 100);
        
        v.abastecer(100);
        v.acelerar();
        c.abastecer(80);
        c.acelerar();
        a.abastecer(90);
        a.acelerar();
        k.abastecer(70);
        k.acelerar();
    }
    
}
