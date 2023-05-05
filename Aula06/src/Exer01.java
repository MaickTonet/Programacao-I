public class Exer01 {
    public static void main(String[] args) {
        
        int n1 = (int) (1 + Math.random() * (9)); //Randomiza valores para as variáveis
        int n2 = (int) (1 + Math.random() * (9));
        int n3 = (int) (1 + Math.random() * (9));
        
        System.out.println("n1: " + n1 + " n2: " +  n2 + " n3: " + n3);

        int maiorValor = maiorValor(n1, n2, n3); //Chama o método para calcular o maior valor das três variáveis
        System.out.println("O maior valor é: " + maiorValor);

        System.out.printf("\nTabela 1\n");
        tabela1(maiorValor); //Chama o método para exibir a primeita tabela do maior valor
        
        System.out.printf("\nTabela 2\n");
        tabela2(maiorValor); //Chama o método para exibir a segunda tabela do maior valor

    }

    public static int maiorValor(int n1, int n2, int n3) { //Valor de parâmetro declarados na main
        int maiorValor = 0;

        if (n1 > maiorValor) { maiorValor = n1; }
        if (n2 > maiorValor) { maiorValor = n2; }
        if (n3 > maiorValor) { maiorValor = n3; }

        return maiorValor; //Retorna o maior valor das três variáveis
    }

    public static void tabela1(int maiorValor) { //Variável do maior valor declarada na main

        for (int i = 1; i <= maiorValor; i++) { //Faz a contagem dos valores
            for (int j = 1; j <= i; j++) { //Faz a contagem das linhas 
                System.out.print(i * j + "  "); //Multiplica os valores e faz a tabela
            }
            System.out.println(); //Quebra de linha da tabela
        }
    }

    public static void tabela2(int maiorValor) { //Variável do maior valor declarada na main

        for (int i = 1; i <= maiorValor; i++) { //Faz a contagem dos valores
            for (int j = i; j <= maiorValor; j++) { //Faz a contagem das linhas, de acordo com o contador "i"
                System.out.print(i * j + "  "); //Multiplica os valores e faz a tabela
            }
            System.out.println(); //Quebra de linha da tabela
        }
    }
}
