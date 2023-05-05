public class foreach {
    public static void main(String[] args) {
        int tam = 10; //Define um tamanho para o vetor
        int[] vetor = new int[tam]; //Define um vetor inteiro

        for(int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (1 + Math.random() * (50)); //Faz a leitura dos valores radômicos para o vetor
        }

        System.out.print("Valores randômicos: "); //Exibe os valores do vetor
        for (int i : vetor) {
            System.out.print(i + " ");
        }
    }
}
