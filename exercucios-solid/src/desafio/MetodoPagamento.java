package desafio;

public interface MetodoPagamento {
    boolean processar(double valor);
    String getNome();
}
