package EstudoTry;

public class Programa {
    public static void main(String[] args) {
        double valorTotal = 1000f;
        double entrada = 300f;
        int parcelas = 10;

        try { // Tenta executar o bloco de comando
            Financiamento f = new Financiamento(valorTotal, entrada, parcelas);
            System.out.println(f.prestacao());
        } catch (RuntimeException e) { // Se houver, captura as exceções da criação do objeto
            System.out.println(e.getMessage()); // Exibe na tela a mensagem formatada da exceção
        }
    }
}