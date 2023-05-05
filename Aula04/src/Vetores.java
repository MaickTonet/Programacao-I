public class Vetores {
    public static void main(String[] args) {
     
        int tam = 10; //Variável contendo o tamanho do vetor
        int [] A = new int[10]; //Declara um vetor inteiro com 10 posições

        for (int i = 0; i < tam; i++) {
            A[i] = (int) (1 + Math.random() * (100)); //Gera números randomicos de 0 a 100, e preenche o vetor com eles
        }

        System.out.println("Vetores");
        for (int i = 0; i < tam; i++) { System.out.print(A[i] + "  "); } //Exibe o vetor completo

    }
}
