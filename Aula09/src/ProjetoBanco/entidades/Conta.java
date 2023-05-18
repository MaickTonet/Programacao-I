package ProjetoBanco.entidades;

public class Conta {
    private int numero;
    private Cliente cliente = new Cliente();
    private double saldo;

    public Conta(int numero, Cliente cliente) {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = 0f;
    }

    public Conta(int numero, Cliente cliente, double saldo) {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public String getCliente() { 
        return cliente.getNome();
    }

    public void deposito(double saldo) {
        this.saldo += saldo;
        System.out.println("O deposito foi realizado");
    }

    public void saque(double saldo) {
        if(saldo + 5.0f > this.saldo) {
            System.out.println("O saldo é isuficiente para realizar o saque desejado");
        } else {
            this.saldo = this.saldo - saldo - 5.0f;
            System.out.println("O saque foi realizado");
        }
    }

    @Override
    public String toString() {
        return "Conta: " + this.numero + " - Cliente: " + cliente.getNome() + "\nEndereço: " + cliente.getEndereco() +
                " - Telefone: " + cliente.getTelefone() + "\nData de nascimento: " + cliente.getDataNascimento() + 
                " - Saldo: " + String.format("R$ %.2f", saldo);
    }
}
