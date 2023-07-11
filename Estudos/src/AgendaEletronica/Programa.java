package AgendaEletronica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        List <Agenda> agenda = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        agenda.add(new Agenda(001, "João Cláudio", "(49) 99174-7639"));
        agenda.add(new Agenda(002, "Luiz Antônio", "(23) 93489-2389"));
        agenda.add(new Agenda(003, "Maria Santos", "(45) 94509-2387"));
        agenda.add(new Agenda(004, "Josué Carlos", "(78) 91254-7689"));
        agenda.add(new Agenda(005, "Vitor Almeida", "(12) 93917-6839"));

        int op;
        do {
            System.out.println("\tAgenda Eletrônica\n");
            System.out.print("1. Exibir agenda\n2. Adicionar contato\n0. Sair\nOpção: ");
            op = scanner.nextInt();

            switch (op) {
                case 1: {
                    System.out.println();
                    agenda.sort(null);

                    for (Agenda itens : agenda) {
                        System.out.println(itens);
                    }

                    System.out.println();
                }
                case 2: {
                    System.out.print("Código: ");
                    int codigo = scanner.nextInt();

                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();

                    agenda.add(new Agenda(codigo, nome, telefone));
                    System.out.println(nome + " adicionado a agenda\n");
                }
                case 0: {
                    System.out.println("Fim do programa");
                }
                default: {
                    System.out.println("Operação inválida");
                }
            }

        } while (op != 0);
        scanner.close();
    }
}
