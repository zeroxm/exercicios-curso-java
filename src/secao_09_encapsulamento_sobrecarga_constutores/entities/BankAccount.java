package secao_09_encapsulamento_sobrecarga_constutores.entities;

public class BankAccount {
    
    final float TAXA_RETIRADA = 5f; 

    protected int numConta;
    protected String portador;
    protected float saldo;

    public BankAccount(int numConta, String portador, float saldo) {
        this.numConta = numConta;
        this.portador = portador;
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void efetuarDeposito(float valor) {
        this.saldo += valor;
    }

    public float efetuarSaque(float valor) {
        this.saldo -= (valor + this.TAXA_RETIRADA) ;
        return this.saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public String getPortador() {
        return portador;
    }

    public String toString(){
        return "Account "+this.numConta+", Holder: "+this.portador+" Balance: $"+String.format(" %.2f", this.getSaldo());
    }


}
