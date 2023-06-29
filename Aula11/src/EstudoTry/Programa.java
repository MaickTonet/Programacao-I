package EstudoTry;

public class Programa {
    public static void main(String[] args) {
        double valorTotal = 1000f;
        double entrada = 300f;
        int parcelas = 10;

        try {
            Financiamento f = new Financiamento(valorTotal, entrada, parcelas);
            System.out.println(f.prestacao());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}