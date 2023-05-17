package ProjetoBanco;

public class Conta {
    private int numero;
    private String cliente;
    private double saldo;

    public Conta(int numero, String cliente) {

    }

    public Conta(int numero, String cliente, double saldo) {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public void deposito(double saldo) {
        this.saldo += saldo;
    }

    public void saque(double saldo) {
        if(this.saldo >= saldo) {
            this.saldo -= saldo;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public String toString() {
        return "Conta: " + this.numero + " - Cliente: " + this.cliente + " - Saldo: " + String.format("R$ %.2f", saldo);
    }
}
