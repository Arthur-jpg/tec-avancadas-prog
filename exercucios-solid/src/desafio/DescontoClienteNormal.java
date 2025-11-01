package desafio;

public class DescontoClienteNormal implements CalculadoraDesconto {
    public double aplicarDesconto(double valor) {
        return valor;
    }

    public String getDescricao() {
        return "Sem desconto";
    }
}
