package conta;
public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual() {
        System.out.println("-----------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
        System.out.println("-----------------------------");
    }
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
        } else if (t == "CP"){
            this.setSaldo(150);
        }
        System.out.println("A conta foi aberta");
    }
    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta em débito");
        } else {
            this.setStatus(false);
            System.out.println("A conta foi fechada");
        }
    }
    public void depositar(float valor) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Depósito realizado");
        } else {
            System.out.println("Esta conta não existe");
        }
    }
    public void sacar(float saque) {
        if (this.getStatus()) {
            if (this.getSaldo() >= saque) {
                this.setSaldo(this.getSaldo() - saque);
                System.out.println("Saque realizado");
            } else {
                System.out.println("Saldo insuficiente");
            } 
        } else {
            System.out.println("Impossível sacar de uma conta fechada");
        }
    }
    public void pagarMensal() {
        int v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP") { 
            v = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo()- v);
            System.out.println("Mensalidade paga");
        } else {
            System.out.println("Impossível pagar");
        }
    }
    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float sa) {
        this.saldo = sa;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean st) {
        this.status = st;
    }
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }
}