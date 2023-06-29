package exemplo;
import java.util.ArrayList;
import java.util.List;

public class ClasseTestePessoa {
    public static void main(String[] args) {
        
        List <Pessoa> lista = new ArrayList<Pessoa>(); // Cria uma nova lista

        Pessoa p1 = new Pessoa(1, "Pedro", "Estudante"); // Declara os objetos
        Pessoa p2 = new Pessoa(2, "Antônio", "Astrólogo");
        Pessoa p3 = new Pessoa(3, "Marcos", "Farmaceutico");

        lista.add(p1); // Adiciona os objetos a lista
        lista.add(p2);
        lista.add(p3);

        lista.sort(null); // Ordena a lista (por ordem alfabética)

        for (Pessoa p : lista) { // Exibe a lsita
            System.out.println(p); // A exibição é feita pelo toString da classe pessoa
        }
    }
}