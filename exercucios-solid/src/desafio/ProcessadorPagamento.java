package desafio;

public class ProcessadorPagamento {
    private NotificadorCliente notificador;

    public ProcessadorPagamento(NotificadorCliente notificador) {
        this.notificador = notificador;
    }

    public boolean processarPagamento(Pedido pedido, MetodoPagamento metodoPagamento, CalculadoraDesconto calculadora) {
        double valorOriginal = pedido.calcularTotal();
        double valorComDesconto = calculadora.aplicarDesconto(valorOriginal);
        
        System.out.println("\n💰 Processando Pagamento do Pedido: " + pedido.getId());
        System.out.println("Valor original: R$ " + String.format("%.2f", valorOriginal));
        System.out.println(calculadora.getDescricao());
        System.out.println("Valor final: R$ " + String.format("%.2f", valorComDesconto));
        System.out.println("Método: " + metodoPagamento.getNome());
        System.out.println("---");
        
        boolean sucesso = metodoPagamento.processar(valorComDesconto);
        
        if (sucesso) {
            pedido.setStatus(StatusPedido.PAGO);
            notificador.enviarNotificacao(
                pedido.getCliente().getEmail(),
                "Pagamento do pedido " + pedido.getId() + " confirmado! Valor: R$ " + String.format("%.2f", valorComDesconto)
            );
        }
        
        return sucesso;
    }
}
