package exercicio10;

public class Processador {
    private Leitor leitor;

    public Processador(Leitor leitor) {
        this.leitor = leitor;
    }

    public void processar() {
        System.out.println(leitor.ler());
    }
}
