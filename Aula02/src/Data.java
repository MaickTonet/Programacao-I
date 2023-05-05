import java.text.DateFormat;
import java.util.Date;

public class Data {
    public static void main(String[] args) {
        
        System.out.println(DateFormat.getInstance().format(new Date())); //Imprime da data formatada no instante em que o projeto é rodado
        System.out.println(DateFormat.getTimeInstance().format(new Date())); //Imprime a hora formatada no instante em que o projeto é rodado
    }
}
