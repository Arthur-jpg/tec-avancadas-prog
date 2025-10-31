package exercicio4;

class Retangulo implements Forma {
    double largura, altura;
    Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public float calcularArea() {
        return (float) (largura*altura);
    }
}