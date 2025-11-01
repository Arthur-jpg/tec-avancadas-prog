package exercicio9;

public class Programa {
    public static void main(String[] args) {
        Repositorio banco = new BancoDeDados();
        RelatorioService service = new RelatorioService(banco);
        service.gerarRelatorio();
    }
}
