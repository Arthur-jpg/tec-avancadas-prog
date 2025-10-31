package exercicio4;

class Circulo implements Forma {
    double raio;
    Circulo(double raio) { this.raio = raio; }

    public float calcularArea() {
        return (float) ((raio*raio)*3.14);
    }
}