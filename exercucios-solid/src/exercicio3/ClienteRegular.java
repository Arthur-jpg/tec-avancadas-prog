package exercicio3;

public class ClienteRegular implements Cliente {
    public double calcularDesconto(double valor) {
        return valor * 0.9;
    }
}
