public class Matriz {
    public static void main(String[] args) {

        int [][] matriz = new int[4][3]; //Declara uma matriz com 4 linhas e 3 colunas
        int [] soma = new int[4]; //Declara um vetor para somar os valores da matriz

        for (int i = 0; i < 4; i++) { //Laço for para as linhas
            for (int j = 0; j < 3; j++) { //Laço for para as colunas
                matriz[i][j] = (int) (1 + Math.random() * (10)); //Gera números randomicos entre 0 e 10 e armazena eles na matriz

                soma[i] += matriz[i][j]; //Soma os valores das linhas da matriz
                System.out.printf("%4d", matriz[i][j]); //Exibe os valores da matriz formatada
            }

            System.out.println("  =  " + soma[i]); //Exibe os valores da soma das de cada linha da matriz
        }
    }
}
