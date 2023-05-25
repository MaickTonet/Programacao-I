package ProjetoProfessores.entidades;
import java.util.ArrayList;
import java.util.List;

public class Professor {
    private int codigo;
    private String nome;
    private List<Disciplina> disciplinas;

    public Professor(int codigo, String nome) { // Construtor
        this.codigo = codigo;
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void adicionarDisciplina(Disciplina disciplina) { // Adicioar disciplinas
        disciplinas.add(disciplina);
    }

    public int somaCarga() { // Somar carga horária do professor
        int cargaTotal = 0;

        for (Disciplina disciplina : disciplinas) {
            cargaTotal += disciplina.getCargaHoraria();
        }
        return cargaTotal;
    }
}