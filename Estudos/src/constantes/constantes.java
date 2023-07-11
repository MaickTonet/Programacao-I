package constantes;

public class constantes {
    public static void main(String[] args) {
        System.out.println("\tCalcular área do círculo\n");

        final double PI = 3.1415; // Define a variável como uma constante, e não pode ser alterada
        double raio = 12; // Valor do raio do círculo

        double area = (PI * Math.pow(raio, 2)); // Calcula á área do círculo
        System.out.println("Área do círculo: " + String.format("%.2f", area)); // Exibe a área formatada
    }
}