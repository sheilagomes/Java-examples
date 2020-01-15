package projetopessoas;
public class Aluno extends Pessoa{
    private int matr;
    private String curso;
    
    public void cancelarMatr() {
        System.out.println("Matrícula será cancelada");
    }

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
