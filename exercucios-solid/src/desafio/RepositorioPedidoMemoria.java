package desafio;

import java.util.HashMap;
import java.util.Map;

public class RepositorioPedidoMemoria implements RepositorioPedido {
    private Map<String, Pedido> pedidos = new HashMap<>();

    public void salvar(Pedido pedido) {
        pedidos.put(pedido.getId(), pedido);
        System.out.println("Pedido " + pedido.getId() + " salvo no repositório.");
    }

    public Pedido buscarPorId(String id) {
        return pedidos.get(id);
    }
}
