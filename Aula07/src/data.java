import java.util.GregorianCalendar;
import java.util.Calendar;
import java.text.DateFormat;
public class data {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();	    

	    System.out.println("Ano: " + gc.get(Calendar.YEAR));
	    System.out.println("Mês: " + gc.get(Calendar.MONTH)); 
	    System.out.println("Dia do mês: " + gc.get(Calendar.DAY_OF_MONTH)); 
	    System.out.println("Dia da semana: " + gc.get(Calendar.DAY_OF_WEEK)); 
	    System.out.println("Dia da ano: " + gc.get(Calendar.DAY_OF_YEAR)); 
	    System.out.println("Semana do ano: " + gc.get(Calendar.WEEK_OF_YEAR));
	    System.out.println("Semana do mês: " + gc.get(Calendar.WEEK_OF_MONTH)); 

	    System.out.println("Dia da semana do mês: " + gc.get(Calendar.DAY_OF_WEEK_IN_MONTH));
	    System.out.println("Hora: " + gc.get(Calendar.HOUR)); 
	    System.out.println("AM/PM? " + gc.get(Calendar.AM_PM)); 
	    System.out.println("Hora do dia: " + gc.get(Calendar.HOUR_OF_DAY)); 
	    System.out.println("Minuto: " + gc.get(Calendar.MINUTE)); 
	    System.out.println("Segundo: " + gc.get(Calendar.SECOND)); 
	    
	    // Adicionar 10 dias:
	    System.out.println("Adicionar 10 dias");
	    gc.add((GregorianCalendar.DAY_OF_MONTH), 10);
	    DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
	    System.out.println(df.format(gc.getTime()));
	    
	    // Para modificar
	    System.out.println("Data modificada:");
	    gc.set(Calendar.YEAR, 2003);
        	gc.set(Calendar.MONTH, Calendar.SEPTEMBER); 
        	gc.set(Calendar.DAY_OF_MONTH, 15);

        System.out.println("Ano: " + gc.get(Calendar.YEAR)); 
        System.out.println("Mês: " + gc.get(Calendar.MONTH)); 
        System.out.println("Dia do mês: " + gc.get(Calendar.DAY_OF_MONTH)); 
    }
}