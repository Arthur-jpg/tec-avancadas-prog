package model;

public class Projeto implements Avaliacao{

    private int entregas;
    private int peso;

    public Projeto(int entregas, int peso) {
        this.entregas = entregas;
        this.peso = peso;
    }

    @Override
    public double calcularNotaFinal() {
        return 0;
    }
}
