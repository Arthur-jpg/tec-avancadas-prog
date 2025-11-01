package desafio;

public class DescontoClientePremium implements CalculadoraDesconto {
    public double aplicarDesconto(double valor) {
        return valor * 0.75; // 25% desconto
    }

    public String getDescricao() {
        return "Desconto de 25% (Cliente Premium)";
    }
}
