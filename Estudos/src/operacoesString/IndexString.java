package operacoesString;

public class IndexString {
    public static void main(String[] args) {
        String str = "Alfaçe, Abacate, Maça, Banana, Abacate"; // Define uma string

        System.out.println(str.indexOf("Abacate")); // Pega a posição onde inicia a palavra selecioanda
        System.out.println(str.lastIndexOf("Abacate")); // Pega a posição onde inicia a última ocorrencia da palavra selecionada
    }
}