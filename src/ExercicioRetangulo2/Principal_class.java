package ExercicioRetangulo2;

public class Principal_class {
    public static void main(String[] args) {
        Retangulo ret1 = new Retangulo(6, 4);
        Retangulo ret2 = new Retangulo();
        
  
        double base = Double.parseDouble(Le_Esc_String.leString("Digite a base do retângulo: "));
        double altura = Double.parseDouble(Le_Esc_String.leString("Digite a altura do retângulo: "));
        ret2.setBase(base);
        ret2.setAltura(altura);
        
        Le_Esc_String.escreveString("Área de ret1: " + ret1.exibeArea());
        Le_Esc_String.escreveString("Perímetro de ret1: " + ret1.exibePerimetro());
        Le_Esc_String.escreveString("Área de ret2: " + ret2.exibeArea());
        Le_Esc_String.escreveString("Perímetro de ret2: " + ret2.exibePerimetro());
        
        if (ret1.exibeArea() > ret2.exibeArea()) {
            Le_Esc_String.escreveString("A maior área é de ret1: " + ret1.exibeArea());
        } else {
            Le_Esc_String.escreveString("A maior área é de ret2: " + ret2.exibeArea());
        }
        
        if (ret1.exibePerimetro() > ret2.exibePerimetro()) {
            Le_Esc_String.escreveString("O maior perímetro é de ret1: " + ret1.exibePerimetro());
        } else {
            Le_Esc_String.escreveString("O maior perímetro é de ret2: " + ret2.exibePerimetro());
        }
    }
}

