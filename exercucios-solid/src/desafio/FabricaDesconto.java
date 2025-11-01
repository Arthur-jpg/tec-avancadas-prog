package desafio;

public class FabricaDesconto {
    public static CalculadoraDesconto obterCalculadora(TipoCliente tipo) {
        switch (tipo) {
            case VIP:
                return new DescontoClienteVIP();
            case PREMIUM:
                return new DescontoClientePremium();
            case REGULAR:
                return new DescontoClienteRegular();
            case NORMAL:
            default:
                return new DescontoClienteNormal();
        }
    }
}
