package exercicio9;

public class RelatorioService {
    private Repositorio repositorio;

    public RelatorioService(Repositorio repositorio) {
        this.repositorio = repositorio;
    }

    public void gerarRelatorio() {
        repositorio.salvar("Relatório de vendas");
    }
}
