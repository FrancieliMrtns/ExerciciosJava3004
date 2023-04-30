package ExercicioRetangulo1;

public class Retangulo {
	
	private double base;
	   private double altura;

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

	   public double getBase() {
	       return base;
	   }

	   public double getAltura() {
	       return altura;
	   }

	   public double calcularArea() {
	       return base * altura;
	   }

	   public double calcularPerimetro() {
	       return 2 * (base + altura);
	   }

}
