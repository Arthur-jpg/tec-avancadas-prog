package desafio;

public class ServicoPedido {
    private RepositorioPedido repositorioPedido;
    private NotificadorCliente notificador;

    public ServicoPedido(RepositorioPedido repositorioPedido, NotificadorCliente notificador) {
        this.repositorioPedido = repositorioPedido;
        this.notificador = notificador;
    }

    public Pedido criarPedido(Cliente cliente) {
        String idPedido = "PED-" + System.currentTimeMillis();
        Pedido pedido = new Pedido(idPedido, cliente);
        return pedido;
    }

    public void finalizarPedido(Pedido pedido) {
        repositorioPedido.salvar(pedido);
        notificador.enviarNotificacao(
            pedido.getCliente().getEmail(),
            "Pedido " + pedido.getId() + " foi criado com sucesso!"
        );
    }
}
