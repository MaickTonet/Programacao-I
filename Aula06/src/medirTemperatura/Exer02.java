package medirTemperatura;

import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in); //Define um objeto para leitura de dados

        float[] tempMax = new float[12]; //Declara vetores para as temperaturas máximas e mínimas
        float[] tempMin = new float[12];

        for (int i = 0; i < 12; i++) { //Faz a leitura das temperaturas máximas e mínimas de cada mês
            System.out.print("Digite a temperatura máxima do " + (i + 1) + "º mês: ");
            tempMax[i] = teclado.nextFloat();

            System.out.print("Digite a temperatura mínima do " + (i + 1) + "º mês: ");
            tempMin[i] = teclado.nextFloat();
        }

        float maiorAno = temp.maxTemp(tempMax); //Chama as funções para descobrir a maior e menor temperatura do ano
        float menorAno = temp.minTemp(tempMin);

        System.out.println("A maior temperatura do ano foi " + maiorAno + "º no mês de " + temp.mostrarTemp(tempMax, maiorAno)); //Exibe as temperaturas
        System.out.println("A menor temperatura do ano foi " + menorAno + "º no mês de " + temp.mostrarTemp(tempMin, menorAno));

        teclado.close(); //Fecha o "teclado"
    }
}