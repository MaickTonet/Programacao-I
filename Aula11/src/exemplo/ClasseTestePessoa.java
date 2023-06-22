package exemplo;
import java.util.ArrayList;
import java.util.List;

public class ClasseTestePessoa {
    public static void main(String[] args) {
        
        List <Pessoa> lista = new ArrayList<Pessoa>();

        Pessoa p1 = new Pessoa(1, "Pedro", "Estudante");
        Pessoa p2 = new Pessoa(2, "Antônio", "Astrólogo");
        Pessoa p3 = new Pessoa(3, "Marcos", "Farmaceutico");

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);

        lista.sort(null);

        for (Pessoa p : lista) {
            System.out.println(p);
        }
    }
}