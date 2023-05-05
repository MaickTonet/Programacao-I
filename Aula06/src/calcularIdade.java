import java.util.Calendar; //Biblioteca para fazer a leitura do ano atual
import java.util.Scanner; //Biblioteca para fazer a leitura de dados

public class calcularIdade {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); //Declara um objeto para fazer a leitura dos dados
        Calendar cal = Calendar.getInstance(); //Declara um calendário para fazer a leitura do ano

        System.out.print("Digite a sua data de nascimento: ");
        int idade = teclado.nextInt(); //Faz a leitura da data de nascimento

        int anoAtual = cal.get(Calendar.YEAR); //Cria uma variável inteira, e atribui a ela o ano atual

        int idadeAtual = anoAtual - idade; //Faz o calculo da idade subtraindo o ano atual pelo ano de nascimento 
        System.out.println("Sua idade é: " + idadeAtual);

        teclado.close(); //Fecha o "teclado"
    }
}