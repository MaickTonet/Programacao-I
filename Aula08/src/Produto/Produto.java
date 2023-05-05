package Produto;

public class Produto {

    private String nome;
    private double preco;
    private int qnt;

    public Produto() { //Inicialização do produto

    }

    public Produto(String nome, double preco) { //Para atribuir um produto novo
        this.nome = nome;
        this.preco = preco;
        this.qnt = 0;
    }
    public Produto(String nome, double preco, int qnt) { //Para alterar um produto já criado
        this.nome = nome;
        this.preco = preco;
        this.qnt = qnt;
    }

    @Override // Substitui o método toString padrão
    public String toString() { // Define o retorno padrão para a exibição do produto
        return "Produto: [Nome =  " + nome + 
                ", Preço = " + String.format("R$ %.2f ", preco) + 
                ", Quantidade em estoque = " + qnt + "]";
    }

    public double valorEstoque() { // Calcula e retorna o valor do estoque
        double valor = (double) (this.preco * this.qnt);
        return valor;
    }

    public void acrescentarProdutos(int qnt) {  // Acrescenta produtos no estoque
        this.qnt += qnt;
        System.out.println("Produto acrescentado");
    }

    public void retirarProdutos(int qnt) { //R emove produtos do estoque
        if (this.qnt >= qnt) { 
            this.qnt -= qnt; 
            System.out.println("Produto retirado");
        }
        else { System.out.println("Estoque indisponível"); }
    }
}