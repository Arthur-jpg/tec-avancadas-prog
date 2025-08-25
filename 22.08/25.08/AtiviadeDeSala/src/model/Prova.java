package model;

public class Prova implements Avaliacao{

    private int acertos;
    private int total;

    public Prova(int acertos, int total) {
        this.acertos = acertos;
        this.total = total;
    }

    @Override
    public double calcularNotaFinal() {
        return 0;
    }
}
