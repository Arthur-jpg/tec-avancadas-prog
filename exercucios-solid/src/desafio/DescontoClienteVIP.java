package desafio;

public class DescontoClienteVIP implements CalculadoraDesconto {
    public double aplicarDesconto(double valor) {
        return valor * 0.85; // 15% desconto
    }

    public String getDescricao() {
        return "Desconto de 15% (Cliente VIP)";
    }
}
