package ProjetoBanco.entidades;

public class Cliente {
    private String nome;
    private String endereco;
    private String telefone;
    private String dataNascimento;

    public Cliente() {
        
    }

    public Cliente(String nome, String endereco, String telefone, String dataNascimento) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }
}
