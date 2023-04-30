package ExercicioMédia3;

public class Principal_class {
    public static void main(String[] args) {
        Media m = new Media();
        m.Acrescenta(3);
        m.Acrescenta(5);
        m.Acrescenta(10);
        m.Acrescenta(8);
        System.out.println("A média atual é: " + m.MediaAtual());
    }
}
