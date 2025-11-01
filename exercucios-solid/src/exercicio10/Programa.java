package exercicio10;

public class Programa {
    public static void main(String[] args) {
        Leitor leitorArquivo = new LeitorArquivo();
        Processador p1 = new Processador(leitorArquivo);
        p1.processar();
        
        System.out.println();
        
        Leitor leitorBanco = new LeitorBancoDados();
        Processador p2 = new Processador(leitorBanco);
        p2.processar();
    }
}
