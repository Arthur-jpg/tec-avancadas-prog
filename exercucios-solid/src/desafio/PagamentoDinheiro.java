package desafio;

public class PagamentoDinheiro implements MetodoPagamento {
    public boolean processar(double valor) {
        System.out.printf("Pagamento em dinheiro: R$ %.2f%nPagamento recebido!%n", valor);
        return true;
    }

    public String getNome() {
        return "Dinheiro";
    }
}
