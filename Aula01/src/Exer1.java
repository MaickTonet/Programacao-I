import java.util.Scanner;

public class Exer1 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in); //Declara um objeto que será usado para leitura de dados

        System.out.print("Digite o valor pago pela hora: ");
        float valorHora = teclado.nextFloat(); //Declara uma variável real, e lê seu valor com o objeto "teclado"

        System.out.print("Digite a quantidade de horas trabalhadas: ");
        int horasTrabalhadas = teclado.nextInt(); //Declara uma variável inteira, e lê seu valor com o objeto "teclado"

        float salario = valorHora * horasTrabalhadas;
        System.out.println("O salario é: " + salario);

        teclado.close();
    }
}
