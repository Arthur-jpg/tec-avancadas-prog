package desafio;

public class FabricaDesconto {
    public static CalculadoraDesconto obterCalculadora(TipoCliente tipo) {
        switch (tipo) {
            case VIP:
                return new DescontoCliente(0.15, "Desconto de 15% (Cliente VIP)");
            case PREMIUM:
                return new DescontoCliente(0.25, "Desconto de 25% (Cliente Premium)");
            case REGULAR:
                return new DescontoCliente(0.05, "Desconto de 5% (Cliente Regular)");
            case NORMAL:
            default:
                return new DescontoCliente(0.0, "Sem desconto");
        }
    }
}
