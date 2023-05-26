package OrdenacaoDisciplinas.Entidades;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Disciplina> disciplinas = new ArrayList<Disciplina>(2);

       for (int i = 0; i < 3; i++) {
            int codigo = (int) (1 + Math.random() * (20));

            String nome = "Disciplina " + (i + 1);

            int fase = (int) (1 + Math.random() * (8));

            int cargaHoraria = (int) (1 + Math.random() * (100));

           disciplinas.add(new Disciplina(codigo, nome, fase, cargaHoraria));
        }
        disciplinas.sort(null);

        for (Disciplina disciplina : disciplinas) {
            System.out.println(disciplina);
        }
    }
}