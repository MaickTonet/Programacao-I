package operacoesString;

public class Trim {
    public static void main(String[] args) {
        String str = "   Olá, Mundo!     ";

        System.out.println(str); // String sem formatação
        System.out.println(str.trim()); // Função que remove os espaços no começo e no final da String
    }
}