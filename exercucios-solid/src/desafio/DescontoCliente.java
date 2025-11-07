package desafio;

public class DescontoCliente implements CalculadoraDesconto {
    private final double percentualDesconto;
    private final String descricao;

    public DescontoCliente(double percentualDesconto, String descricao) {
        this.percentualDesconto = percentualDesconto;
        this.descricao = descricao;
    }

    public double aplicarDesconto(double valor) {
        return valor * (1 - percentualDesconto);
    }

    public String getDescricao() {
        return descricao;
    }
}
