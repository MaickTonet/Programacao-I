package OrdenacaoDisciplinas.Entidades;

public class Disciplina implements Comparable <Disciplina> {
    private Integer codigo;
    private String nome;
    private Integer fase;
    private Integer cargaHorario;

    public Disciplina(Integer codigo, String nome, Integer fase, Integer cargaHoraria) {
        this.codigo = codigo;
        this.nome = nome;
        this.fase = fase;
        this.cargaHorario = cargaHoraria;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }
    
    public Integer getFase() {
        return fase;
    }

    public Integer getCargaHoraria() {
        return cargaHorario;
    }

    @Override
    public int compareTo(Disciplina d) {
        return this.getNome().compareTo(d.getNome());
    }

    @Override
    public String toString() {
        return "Código: " + codigo + " - Nome: " + nome + " - Fase: " + fase + " - Carga Horária: " + cargaHorario + "\n";
    }   
}