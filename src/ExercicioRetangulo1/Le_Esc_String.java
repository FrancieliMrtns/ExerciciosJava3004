package ExercicioRetangulo1;

import java.util.Scanner;

public class Le_Esc_String {
   private static Scanner scanner = new Scanner(System.in);

   public static String lerString(String mensagem) {
       System.out.print(mensagem);
       return scanner.nextLine();
   }

   public static void escreverString(String mensagem) {
       System.out.println(mensagem);
   }
}
