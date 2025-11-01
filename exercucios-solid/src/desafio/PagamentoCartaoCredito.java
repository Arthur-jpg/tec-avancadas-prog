package desafio;

public class PagamentoCartaoCredito implements MetodoPagamento {
    private String numeroCartao;

    public PagamentoCartaoCredito(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public boolean processar(double valor) {
        System.out.println("Processando pagamento de R$ " + String.format("%.2f", valor) + 
                         " no cartão de crédito **** " + numeroCartao.substring(numeroCartao.length() - 4));
        System.out.println("Pagamento aprovado!");
        return true;
    }

    public String getNome() {
        return "Cartão de Crédito";
    }
}
