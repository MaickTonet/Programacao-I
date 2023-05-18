package ProjetoBanco.entidades;

public class Conta {
    private int numero;
    private String cliente;
    private double saldo;

    public Conta(int numero, String cliente) {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = 0f;
    }

    public Conta(int numero, String cliente, double saldo) {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public void deposito(double saldo) {
        this.saldo += saldo;
        System.out.println("O saldo foi realizado");
    }

    public void saque(double saldo) {
        if(this.saldo >= saldo) {
            this.saldo -= saldo;
            System.out.println("O saque foi realizado");
        } else {
            System.out.println("O saldo é insuficiente para realizar o saque desejado");
        }
    }

    @Override
    public String toString() {
        return "Conta: " + this.numero + " - Cliente: " + this.cliente + " - Saldo: " + String.format("R$ %.2f", saldo);
    }
}
