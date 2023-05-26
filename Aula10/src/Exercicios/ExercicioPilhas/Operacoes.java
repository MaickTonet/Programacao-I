import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
/*
    Construir um programa que leia 10 números inteiros e os insira em uma pilha.  
    Em seguida devem ser lidos, um a um, 5 operadores que podem ser  “+”, ”-“ , “*”  ou  “/”
    Dois elementos de cada vez devem ser retirados da pilha e o resultado da operação entre eles deve ser inserido em uma fila.  
    No final, a fila com os resultados deve ser mostrada.
 */
public class Operacoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack <Integer> pilha = new Stack <Integer>(); // Inicialização da pilha
        Queue <Integer> fila = new LinkedList<Integer>(); // Inicialização da fila

        for (int i = 0; i < 10; i++) {
            int n = (int) (1 + Math.random() * (20)); 
            pilha.push(n);
        }

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o operador: ");
            char op = scanner.next().charAt(0);

            switch (op) {
                case '+': {
                    int n1 = pilha.pop(); int n2 = pilha.pop();
                    fila.add(n1 + n2);
                    break;
                }
                case '-': {
                    int n1 = pilha.pop(); int n2 = pilha.pop();
                    fila.add(n1 - n2);
                    break;
                }
                case '*': {
                    int n1 = pilha.pop(); int n2 = pilha.pop();
                    fila.add(n1 * n2);
                    break;
                }
                case '/': {
                    int n1 = pilha.pop(); int n2 = pilha.pop();
                    fila.add(n1 / n2);
                    break;
                }            
                default: {
                    System.out.println("Operação inválida\n");
                }
            }            
        }        
        System.out.println("Fila: " + fila);
        scanner.close();
    }
}