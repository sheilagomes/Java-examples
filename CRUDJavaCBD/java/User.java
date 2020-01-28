package model;

public class User {

    private int id;
    private String nome;
    private String prof;
    private String local;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProf() {
        return prof;
    }

    public void setProf(String prof) {
        this.prof = prof;
    }


    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", nome=" + nome + ", prof=" + prof + ", local=" + local + '}';
    }

       
}