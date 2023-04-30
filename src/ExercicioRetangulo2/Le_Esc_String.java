package ExercicioRetangulo2;
import java.util.Scanner;

class Le_Esc_String {
    public static String leString(String texto) {
        Scanner leitor = new Scanner(System.in);
        System.out.print(texto);
        String valor = leitor.nextLine();
        return valor;
    }
    
    public static void escreveString(String texto) {
        System.out.println(texto);
    }
}

