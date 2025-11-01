package desafio;

public class PagamentoDinheiro implements MetodoPagamento {
    public boolean processar(double valor) {
        System.out.println("Pagamento em dinheiro: R$ " + String.format("%.2f", valor));
        System.out.println("Pagamento recebido!");
        return true;
    }

    public String getNome() {
        return "Dinheiro";
    }
}
