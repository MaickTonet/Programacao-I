import java.util.Scanner;

public class SubstituirPalavra {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in); //Declara um objeto para fazer a leitura dos dados

        System.out.print("Digite um frase: ");
        String frase = teclado.nextLine(); //Faz a leitura da String digitada
        
        System.out.print("Digite a palavra a ser buscada: ");
        String palavraBuscar = teclado.nextLine(); //Faz a leitura da palavra a ser buscada

        if (frase.contains(palavraBuscar)) { //Verifica se a "frase" possui a "palavra buscada"
            System.out.print("Digite a palavra para substituir: ");
            String palavraSubstituir = teclado.nextLine(); //Faz a leitura da palavra a ser substituida

            String fraseNova = frase.replace(palavraBuscar, palavraSubstituir); //Declara uma nova string substituindo a palavra antes buscada
            System.out.println("Frase original: " + frase);
            System.out.println("Frase modificada: " + fraseNova);
        } else {
            System.out.println("A palavra buscada não foi encontrada"); //Caso a "palavra buscada" não seja encontrada, essa será a mensagem exibida
        }

        teclado.close();
    }
}
