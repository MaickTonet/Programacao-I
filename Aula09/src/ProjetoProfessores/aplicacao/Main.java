package ProjetoProfessores.aplicacao;
import ProjetoProfessores.entidades.Disciplina;
import ProjetoProfessores.entidades.Professor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade de professores: ");
        int qntProfessores = scanner.nextInt();
        System.out.println();

        List<Professor> professores = new ArrayList<>(); // Inicializa a array de professores

        for (int i = 0; i < qntProfessores; i++) {
            System.out.print("Código do professor: ");
            int codigo = scanner.nextInt();

            scanner.nextLine(); // Limpa o buffer do teclado
            System.out.print("Nome do professor: ");
            String nome = scanner.nextLine();

            Professor professor = new Professor(codigo, nome); // Construtor do professor

            System.out.print("Quantidade de disciplinas do professor: ");
            int qntDisciplinas = scanner.nextInt();

            System.out.println();

            for (int j = 0; j < qntDisciplinas; j++) {
                System.out.print("Código da disciplina: ");
                int codigoDisciplina = scanner.nextInt();

                scanner.nextLine(); // Limpa o buffer do teclado
                System.out.print("Nome da disciplina: ");
                String nomeDisciplina = scanner.nextLine();

                System.out.print("Fase da disciplina: ");
                int faseDisciplina = scanner.nextInt();

                System.out.print("Carga horária da disciplina: ");
                int cargaHorariaDisciplina = scanner.nextInt();

                Disciplina disciplina = new Disciplina(codigoDisciplina, nomeDisciplina, faseDisciplina, cargaHorariaDisciplina); // Construtor da disciplina
                professor.adicionarDisciplina(disciplina); // Adiciona a disciplina na Array do professor

                System.out.println();
            }

            professores.add(professor); // Adiciona o professor na Array de professores
            System.out.println();
        }

        System.out.println("\tListagem dos Professores");
        for (Professor professor : professores) {
            System.out.println("Código: " + professor.getCodigo());
            System.out.println("Nome: " + professor.getNome());
            System.out.println("Disciplinas:\n");

            for (Disciplina disciplina : professor.getDisciplinas()) {
                System.out.println("\tCódigo: " + disciplina.getCodigo());
                System.out.println("\tNome: " + disciplina.getNome());
                System.out.println("\tFase: " + disciplina.getFase());
                System.out.println("\tCarga Horária: " + disciplina.getCargaHoraria() + "\n");
            }

            System.out.println("Carga Horária Total: " + professor.somaCarga());
            System.out.println();
        }
        
        scanner.close();
    }
}