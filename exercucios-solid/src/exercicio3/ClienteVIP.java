package exercicio3;

public class ClienteVIP implements Cliente {
    public double calcularDesconto(double valor) {
        return valor * 0.8;
    }
}
