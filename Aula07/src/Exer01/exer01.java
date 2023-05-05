package Exer01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class exer01 { 
    public static void main(String[] args) {
        System.out.println(imprimirData());
    }

    public static String imprimirData() {
        SimpleDateFormat formato = new SimpleDateFormat("'Hoje é' EEEE dd MMMM 'de' y 'e agora são' HH 'horas e' mm 'minutos'");        
        Date data = new Date();
        return formato.format(data);
    }
}