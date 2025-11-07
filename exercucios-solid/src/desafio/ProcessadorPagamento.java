package desafio;

public class ProcessadorPagamento {
    private final NotificadorCliente notificador;

    public ProcessadorPagamento(NotificadorCliente notificador) {
        this.notificador = notificador;
    }

    public boolean processarPagamento(Pedido pedido, MetodoPagamento metodoPagamento, CalculadoraDesconto calculadora) {
        double valorOriginal = pedido.calcularTotal();
        double valorComDesconto = calculadora.aplicarDesconto(valorOriginal);
        
        System.out.printf("%nProcessando Pagamento do Pedido: %s%n" +
                         "Valor original: R$ %.2f%n%s%nValor final: R$ %.2f%n" +
                         "Método: %s%n---%n",
                         pedido.getId(), valorOriginal, calculadora.getDescricao(), 
                         valorComDesconto, metodoPagamento.getNome());
        
        boolean sucesso = metodoPagamento.processar(valorComDesconto);
        
        if (sucesso) {
            pedido.setStatus(StatusPedido.PAGO);
            notificador.enviarNotificacao(pedido.getCliente().getEmail(),
                String.format("Pagamento do pedido %s confirmado! Valor: R$ %.2f", 
                            pedido.getId(), valorComDesconto));
        }
        
        return sucesso;
    }
}
