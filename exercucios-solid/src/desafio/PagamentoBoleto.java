package desafio;

public class PagamentoBoleto implements MetodoPagamento {
    public boolean processar(double valor) {
        System.out.printf("Gerando boleto bancário no valor de R$ %.2f%n" +
                         "Código de barras: 34191.79001 01043.510047 91020.150008 1 87360000000100%n" +
                         "Boleto gerado com sucesso!%n", valor);
        return true;
    }

    public String getNome() {
        return "Boleto Bancário";
    }
}
