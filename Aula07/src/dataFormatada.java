import java.text.DateFormat;
import java.util.Date;

public class dataFormatada {
    public static void main(String[] args) {
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT);
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM);
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.LONG);
		DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL);
		
		Date data1 = new Date();

		System.out.println("Data formato padrão = "+data1);

		System.out.println("Data formato 1 = "+df1.format(data1));
		System.out.println("Data formato 2 = "+df2.format(data1));
		System.out.println("Data formato 3 = "+df3.format(data1));
		System.out.println("Data formato 4 = "+df4.format(data1));
    }
}