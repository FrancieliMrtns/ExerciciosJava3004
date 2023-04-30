package ExercicioMédia4;
import java.util.Scanner;

class Principal_class {
    public static void main(String[] args) {
        Media m = new Media();
        Scanner scanner = new Scanner(System.in);
        float numero;

        do {
            System.out.print("Digite um número (Ou ressione 0 para encerrar): ");
            numero = scanner.nextFloat();
            if (numero != 0) {
                m.Acrescenta(numero);
                System.out.println("Média atual: " + m.MediaAtual());
            }
        } while (numero != 0);

        scanner.close();
    }
}