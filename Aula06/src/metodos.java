public class metodos {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;

        int resultado = soma(n1, n2);
        diminuir(n1, n2);

        System.out.println("Resultado: " + resultado);
    }

    public static int soma(int n1, int n2) {
        int soma;
        soma = n1 + n2;
        return soma;
    }

    public static void diminuir(int n1, int n2) {
        int dif = 0;
        dif = n1 - n2;
        System.out.println("A diferença é: " + dif);
    }
}

