package ExercicioRetangulo1;

public class Principal_class {
	public static void main(String[] args) {
	       double base = Double.parseDouble(Le_Esc_String.lerString("Digite a base: "));
	       double altura = Double.parseDouble(Le_Esc_String.lerString("Digite a altura: "));

	       Retangulo retangulo = new Retangulo(base, altura);

	       Le_Esc_String.escreverString("A área do retângulo é: " + retangulo.calcularArea());
	       Le_Esc_String.escreverString("O perímetro do retângulo é: " + retangulo.calcularPerimetro());
	   }

}
