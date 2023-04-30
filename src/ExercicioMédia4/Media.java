package ExercicioMédia4;
import java.util.Scanner;

class Media {
    private float soma;
    private float contador;

    public Media() {
        soma = 0;
        contador = 0;
    }

    public void Acrescenta(float valor) {
        soma += valor;
        contador++;
    }

    public float MediaAtual() {
        if (contador != 0) {
            return soma / contador;
        }
        return 0;
    }
}
