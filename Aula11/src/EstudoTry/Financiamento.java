package EstudoTry;

public class Financiamento {
    private double valorTotal;
    private double entrada;
    private int parcelas;

    public Financiamento(double valorTotal, double entrada, int parcelas) { // Construtor

        if (entrada < valorTotal * 0.2) { // Verifica se a entrada é menor que 20%
            throw new RuntimeException("A entrada deve ser pelo menos 20% do valor total"); // Retorna a exceção para a função main
        } else if (parcelas < 6) { // Verifica se a quantidade de parcelas é menor que 6
            throw new RuntimeException("O número mínimo de parcelas deve ser 6"); // Retorna a exceção para a função main
        }

        this.valorTotal = valorTotal;
        this.entrada = entrada;
        this.parcelas = parcelas;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getEntrada() {
        return entrada;
    }

    public void setEntrada(double entrada) {
        this.entrada = entrada;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public double prestacao() { // Calcula o valor das prestações
        return (valorTotal - entrada) / parcelas;
    }

    @Override
    public String toString() {
        return "Financiamento: valorTota: " + String.format("%.2f", getValorTotal()) + 
        ", entrada: " + String.format("%.2f", getEntrada()) + ", parcelas: " + parcelas;
    }    
}