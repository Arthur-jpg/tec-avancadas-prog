package exercicio2;

public class Programa {
    public static void main(String[] args) {
        Relatorio r = new Relatorio();
        PersistenciaRelatorio p = new PersistenciaRelatorio();
        
        r.gerar();
        p.salvarEmArquivo();
    }
}
