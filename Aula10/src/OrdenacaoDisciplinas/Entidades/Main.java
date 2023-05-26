package OrdenacaoDisciplinas.Entidades;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Disciplina> disciplinas = new ArrayList<Disciplina>(2);

       for (int i = 0; i < 5; i++) {
            int codigo = (int) (1 + Math.random() * (110 - 1));

            String nome = "Disciplina " + (int) (1 + Math.random() * (110 - 1));

            int fase = (int) (1 + Math.random() * (110 - 1));

            int cargaHoraria = (int) (1 + Math.random() * (110 - 1));

           disciplinas.add(new Disciplina(codigo, nome, fase, cargaHoraria));
        }
        disciplinas.sort(null);

        for (Disciplina disciplina : disciplinas) {
            System.out.println(disciplina);
        }
    }
}