import java.util.Scanner;

public class ClasseMath {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Calcular retângulo");

        System.out.print("Digite a largura: ");
        double largura = ler.nextDouble();
        
        System.out.print("Digite a altura: ");
        double altura = ler.nextDouble();

        double perimetro = largura * 2 + altura * 2;
        double area = largura * altura;
        double diagonal = Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));

        System.out.println("Perímetro: " + perimetro);
        System.out.println("Área: " + area);
        System.out.println("Diagonal: " + String.format("%.2f", diagonal));

        ler.close();
    }
}
