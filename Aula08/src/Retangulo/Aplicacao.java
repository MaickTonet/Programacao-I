package Retangulo;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Calculo de retângulo");

        System.out.print("Digite a largura do retângulo: ");
        double largura = ler.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        double altura = ler.nextDouble();

        Retangulo retangulo = new Retangulo(largura, altura);
        System.out.println(retangulo);

        ler.close(); 
    }
}
