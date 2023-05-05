package Retangulo;

public class Retangulo {
    public double largura;
    public double altura;

    public Retangulo(double largura, double altura) { // Atribui os valores vindos da main
        this.largura = largura;
        this.altura = altura;
    }

    public double area() { // Calcula e retorna a área do retângulo
        double area = (double) this.largura * this.altura;
        return area;
    }

    public double perimetro() { // Calcula e retorna o perímetro do retângulo
        double perimetro = (double) (this.largura * 2) + (this.altura * 2);
        return perimetro;
    }

    public double diagonal() { // Calcula e retorna a diagonal do retântulo
        double diagonal = (double) Math.sqrt(Math.pow(this.largura, 2) + Math.pow(this.altura, 2));
        return diagonal;
    }

    @Override
    public String toString() {
        return "Largura = " + largura + ", Altura = " + altura + 
               ", Área = " + area() + ", Perímetro = " + perimetro() + 
               ", Diagonal = " + String.format("%.2f", diagonal());
    }
}
