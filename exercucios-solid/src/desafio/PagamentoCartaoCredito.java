package desafio;

public class PagamentoCartaoCredito implements MetodoPagamento {
    private final String numeroCartao;

    public PagamentoCartaoCredito(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public boolean processar(double valor) {
        System.out.printf("Processando pagamento de R$ %.2f no cartão de crédito **** %s%nPagamento aprovado!%n", 
                         valor, numeroCartao.substring(numeroCartao.length() - 4));
        return true;
    }

    public String getNome() {
        return "Cartão de Crédito";
    }
}
