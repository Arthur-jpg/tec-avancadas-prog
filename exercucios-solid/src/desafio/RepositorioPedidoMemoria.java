package desafio;

public class RepositorioPedidoMemoria extends RepositorioMemoria<Pedido, String> implements RepositorioPedido {
    public void salvar(Pedido pedido) {
        salvar(pedido.getId(), pedido, "Pedido " + pedido.getId());
    }
}
