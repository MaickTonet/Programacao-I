package Produto;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("*** Catalogar produto ***");

        System.out.print("Digite o nome do produto: ");
        String nome = ler.nextLine();

        System.out.print("Agora digite o preço do produto: ");
        double preco = ler.nextDouble();

        Produto p1 = new Produto(nome, preco);
        System.out.println(p1);



        ler.close();
    }
}
