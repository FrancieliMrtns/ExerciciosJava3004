package ExercicioRetangulo2;
import java.util.Scanner;

class Retangulo {
    private double base;
    private double altura;
    
    public Retangulo() {
        this.base = 0;
        this.altura = 0;
    }
    
    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public void setBase(double base) {
        this.base = base;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double exibeArea() {
        double area = this.base * this.altura;
        return area;
    }
    
    public double exibePerimetro() {
        double perimetro = 2 * (this.base + this.altura);
        return perimetro;
    }
}



