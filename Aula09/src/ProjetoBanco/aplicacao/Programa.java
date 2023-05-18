package ProjetoBanco.aplicacao;
import java.util.Scanner;

import ProjetoBanco.entidades.Conta;

public class Programa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("** Projeto: Banco **");

        System.out.print("Informe o número da conta: ");
        int numero = teclado.nextInt();
        
        System.out.print("Informe o nome do cliente: ");
        String cliente =  teclado.next();
                
        System.out.print("Será realizado um depósito inicial? ");
        char op = teclado.next().charAt(0);

        if (Character.toUpperCase(op) == 'S') {

            System.out.println();
            System.out.print("Informe o valor do depósito inicial: ");
            double deposito = teclado.nextDouble();
            System.out.println();

            Conta conta1 = new Conta(numero, cliente, deposito);

            System.out.println("A conta foi criada");
            System.out.println(conta1);
            System.out.println();

            System.out.print("Informe o valor a ser depositado: ");
            deposito = teclado.nextDouble();
            System.out.println();

            conta1.deposito(deposito);

            System.out.println(conta1);
            System.out.println();

            System.out.print("Informe o valor a ser sacado: ");
            double saque = teclado.nextDouble();
            System.out.println();

            conta1.saque(saque);

            System.out.println(conta1);
            System.out.println();

        } else if (Character.toUpperCase(op) == 'N') {
            Conta conta1 = new Conta(numero, cliente);

            System.out.println();
            System.out.println("A conta foi criada");
            System.out.println(conta1);

            System.out.print("Informe o valor a ser depositado: ");
            double deposito = teclado.nextDouble();
            System.out.println();

            conta1.deposito(deposito);

            System.out.println(conta1);
            System.out.println();

            System.out.print("Informe o valor a ser sacado: ");
            double saque = teclado.nextDouble();
            System.out.println();

            conta1.saque(saque);

            System.out.println(conta1);
            System.out.println();    

        } else {
            System.out.println("Operação invalida!");
        }

        teclado.close();
    }
}