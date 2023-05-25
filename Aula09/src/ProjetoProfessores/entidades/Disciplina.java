package ProjetoProfessores.entidades;

public class Disciplina {
    private int codigo;
    private String nome;
    private int fase;
    private int cargaHoraria;

    public Disciplina(int codigo, String nome, int fase, int cargaHoraria) { // Construtor
        this.codigo = codigo;
        this.nome = nome;
        this.fase = fase;
        this.cargaHoraria = cargaHoraria;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getFase() {
        return fase;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }    
}