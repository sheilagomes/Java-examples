package aula13;
public class Mamifero extends Animal {
    protected String corPelo;
    
    @Override
    public void emitirSom() {
        System.out.println("Som de mamifero");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
    
}
