import java.util.Stack;
/*
 Escreva um programa que leia 10 números.  Para cada número lido, verifique e codifique de acordo com as regras a seguir:
- Se o número for par, empilhe
- Se o número for ímpar, desempilhe um número existente na pilha. Caso a pilha esteja vazia, mostre uma mensagem informando isso.
- Se ao final do programa a pilha não estiver vazia, desempilhe todos os elementos, mostrando-os na tela.
*/
public class ExerPilhas {
    public static void main(String[] args) {
        Stack <Integer> pilha = new Stack <Integer>(); // Declaração da pilha

        for (int i = 0; i < 10; i++) {
            int n = (int) (1 + Math.random() * (20)); // Leitura de números randomicos

            if (n % 2 == 0) {
                pilha.push(n); // Empilha um elemento
            } else {
                if (!pilha.isEmpty()) { // Verifica se a pilha esta vazia
                    pilha.pop(); // Desempilha um elemento
                }
            }
        }

        if (pilha.isEmpty()) {
            System.out.println("A pilha está vazia");
        } else {
            System.out.println("Tamanho: " + pilha.size() + " Pilha: " + pilha); // Exibe o tamanho da pilha, e seus elementos
        }
    }
}