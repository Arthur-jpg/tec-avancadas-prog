package desafio;

public class PagamentoBoleto implements MetodoPagamento {
    public boolean processar(double valor) {
        System.out.println("Gerando boleto bancário no valor de R$ " + String.format("%.2f", valor));
        System.out.println("Código de barras: 34191.79001 01043.510047 91020.150008 1 87360000000100");
        System.out.println("Boleto gerado com sucesso!");
        return true;
    }

    public String getNome() {
        return "Boleto Bancário";
    }
}
