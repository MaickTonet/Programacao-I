package medirTemperatura;

public class temp {

    public static float maxTemp(float[] temp) { //Função para descobrir a maior temperatura do ano
        float maiorTemp = temp[0]; //Define a primeira posição do vetor sendo a maior temperatura

        for(int i = 0; i < temp.length; i++) {
            if (temp[i] > maiorTemp) { maiorTemp = temp[i]; } //Descobre a maior temperatura do vetor
        }

        return maiorTemp; //Retorna a maior temperatura
    }

    public static float minTemp(float[] temp) { //Função para descobrir a menor temperatura do ano
        float menorTemp = temp[0]; //Define a primeira posição do vetor sendo a menor temperatura

        for(int i = 0; i < temp.length; i++) {
            if (temp[i] < menorTemp) { menorTemp = temp[i]; } //Descobre a menor temperatura do vetor
        }

        return menorTemp; //Retorna a menor temperatura
    }

    private static String[] meses = {"janeiro", "fevereiro", "março", "abril", "maio", "junho",
    "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"}; //Declara um vetor de strings com todos os meses do ano

    public static String mostrarTemp(float[] temperaturaMes, float valorMes) { //Função para descobrir o mês do ano
        int mesIndicado = -1; //Cria uma variável que será a posição do mês dentro do vetor

        for (int i = 0; i < temperaturaMes.length; i++) {
            if (temperaturaMes[i] == valorMes) { //Compara os meses do vetor com o valor passado por referência
                mesIndicado = i; //Atribui ao "mesIndicado" a posição do mês correspondente no vetor
            }
        }

        return meses[mesIndicado]; //Retorna a posição do mês correspondente no vetor
    }
}