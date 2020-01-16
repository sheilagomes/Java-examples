package desafio02exercicioheranca;
public class Desafio02ExercicioHeranca {
    public static void main(String[] args) {
        Veiculo v = new Veiculo("Volkswagen", 150, 5, 100);
        Carro c = new Carro("Gol", 4, 2020, "Volkswagen", 150, 5, 100);
        Aviao a = new Aviao("1", "Comercial", "Volkswagen", 150, 5, 100);
        
        System.out.println(v.toString());
        System.out.println(c.toString());
        System.out.println(a.toString());
    }
    
}
