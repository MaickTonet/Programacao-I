package exemplo;

public class Pessoa implements Comparable <Pessoa> {
    private int codigo;
    private String nome;
    private String profissao;

    public Pessoa(int codigo, String nome, String profissao) {
        this.codigo = codigo;
        this.nome = nome;
        this.profissao = profissao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String nome() {
        return nome;
    }

    public void nome(String nome) {
        this.nome = nome;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    @Override
    public int compareTo(Pessoa p) { // Ordena a lista por ordem alfabética (Gerado pelo vsCode)
        return this.nome.compareTo(p.nome());
    }

    @Override
    public String toString() { // Muda a exibição padrão do objeto pessoa
        return "Pessoa: Codigo: " + codigo + " - Nome: " + nome + " - Profissao: " + profissao + "";
    }
}