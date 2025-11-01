package desafio;

public class PagamentoPix implements MetodoPagamento {
    private String chave;

    public PagamentoPix(String chave) {
        this.chave = chave;
    }

    public boolean processar(double valor) {
        System.out.println("Gerando QR Code PIX para R$ " + String.format("%.2f", valor));
        System.out.println("Chave PIX: " + chave);
        System.out.println("Pagamento via PIX confirmado!");
        return true;
    }

    public String getNome() {
        return "PIX";
    }
}
