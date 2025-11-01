package desafio;

public interface RepositorioPedido {
    void salvar(Pedido pedido);
    Pedido buscarPorId(String id);
}
