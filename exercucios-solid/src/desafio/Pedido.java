package desafio;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String id;
    private Cliente cliente;
    private List<ItemPedido> itens;
    private StatusPedido status;

    public Pedido(String id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
        this.status = StatusPedido.PENDENTE;
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public String getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public double calcularTotal() {
        return itens.stream()
                .mapToDouble(ItemPedido::getSubtotal)
                .sum();
    }
}
