package ProjetoFuncionarios.Entidades;

public class Funcionario {
    private int codigo;
    private String nome;
    private double salario;

    public Funcionario(int codigo, String nome, double salario) { // Construtor
        this.codigo = codigo;
        this.nome = nome;
        this.salario = salario;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getCSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}