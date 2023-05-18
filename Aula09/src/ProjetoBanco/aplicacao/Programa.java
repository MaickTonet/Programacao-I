package ProjetoBanco.aplicacao;
import java.util.Scanner;

import ProjetoBanco.entidades.Conta;

public class Programa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("** Projeto: Banco **");

        System.out.print("Informe o número da conta: ");
        int numero = Integer.parseInt(teclado.nextLine());
        
        System.out.print("Informe o nome do cliente: ");
        String cliente =  teclado.nextLine();
                
        System.out.print("Será realizado um depósito inicial? ");
        char op = teclado.next().charAt(0);

        Conta conta;

        if (Character.toUpperCase(op) == 'S') {

            System.out.println();
            System.out.print("Informe o valor do depósito inicial: ");
            double deposito = teclado.nextDouble();
            System.out.println();

            conta = new Conta(numero, cliente, deposito);

        } else {
            conta = new Conta(numero, cliente);
        }

        System.out.println("A conta foi criada");
        System.out.println();

        System.out.print("Informe o valor a ser depositado: ");
        double valor = teclado.nextDouble();
        conta.deposito(valor);
        System.out.println();

        System.out.print("Informe o valor a ser sacado: ");
        valor = teclado.nextDouble();
        conta.saque(valor);

        System.out.println();
        System.out.println(conta);

        teclado.close();
    }
}