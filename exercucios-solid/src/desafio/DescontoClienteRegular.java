package desafio;

public class DescontoClienteRegular implements CalculadoraDesconto {
    public double aplicarDesconto(double valor) {
        return valor * 0.95; // 5% desconto
    }

    public String getDescricao() {
        return "Desconto de 5% (Cliente Regular)";
    }
}
