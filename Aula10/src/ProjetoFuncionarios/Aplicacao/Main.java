package ProjetoFuncionarios.Aplicacao;
import ProjetoFuncionarios.Entidades.Funcionario;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Funcionario> funcionarios = new ArrayList<>();

        System.out.print("Quantidade de funcionários: ");
        int qntFuncionarios = scanner.nextInt();

        for (int i = 0; i < qntFuncionarios; i++) {
            System.out.print("Código do funcionário: ");
            int codigo = scanner.nextInt();
    
            scanner.nextLine(); // Limpar o buffer do teclado
            System.out.print("Nome do funcionário: ");
            String nome = scanner.nextLine();
    
            System.out.print("Salário do funcionário: ");
            double salario = scanner.nextDouble();
    
            Funcionario funcionario = new Funcionario(codigo, nome, salario); // Criação do objeto funcionario
            funcionarios.add(funcionario); // Adição do funcionário na Arraylist    
        }
        
        System.out.print("Digite o código do funcionário para receber aumento: ");
        int codigoAumento = scanner.nextInt();

        for (Funcionario i : funcionarios) {
            if(i.getCodigo() == codigoAumento) {
                System.out.print("Valor do aumento: ");
                double aumento = scanner.nextDouble();

                i.setSalario(i.getCSalario() + i.getCSalario() * aumento / 100); // Calculo do aumento do salário
                System.out.println("Aumento realizado\n");
                System.out.println("Novo salário: R$" + i.getCSalario());
            }
        }
        scanner.close();
    }
}