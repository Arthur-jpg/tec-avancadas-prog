package desafio;

import java.util.HashMap;
import java.util.Map;

public class RepositorioClienteMemoria implements RepositorioCliente {
    private Map<String, Cliente> clientes = new HashMap<>();

    public void salvar(Cliente cliente) {
        clientes.put(cliente.getId(), cliente);
        System.out.println("Cliente " + cliente.getNome() + " salvo no repositório.");
    }

    public Cliente buscarPorId(String id) {
        return clientes.get(id);
    }
}
