package desafio;

public class PagamentoPix implements MetodoPagamento {
    private final String chave;

    public PagamentoPix(String chave) {
        this.chave = chave;
    }

    public boolean processar(double valor) {
        System.out.printf("Gerando QR Code PIX para R$ %.2f%nChave PIX: %s%nPagamento via PIX confirmado!%n", 
                         valor, chave);
        return true;
    }

    public String getNome() {
        return "PIX";
    }
}
