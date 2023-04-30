package ExercicioMédia3;

class Media {
    private float soma;
    private float contador;

    public Media() {
        this.soma = 0;
        this.contador = 0;
    }

    public void Acrescenta(float valor) {
        this.soma += valor;
        this.contador++;
    }

    public float MediaAtual() {
        if (this.contador == 0) {
            return 0;
        } else {
            return this.soma / this.contador;
        }
    }

}

