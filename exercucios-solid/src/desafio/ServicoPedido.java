package desafio;

public class ServicoPedido {
    private final RepositorioPedido repositorioPedido;
    private final NotificadorCliente notificador;

    public ServicoPedido(RepositorioPedido repositorioPedido, NotificadorCliente notificador) {
        this.repositorioPedido = repositorioPedido;
        this.notificador = notificador;
    }

    public Pedido criarPedido(Cliente cliente) {
        return new Pedido("PED-" + System.currentTimeMillis(), cliente);
    }

    public void finalizarPedido(Pedido pedido) {
        repositorioPedido.salvar(pedido);
        notificador.enviarNotificacao(pedido.getCliente().getEmail(),
            "Pedido " + pedido.getId() + " foi criado com sucesso!");
    }
}
