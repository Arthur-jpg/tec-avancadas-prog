package desafio;

public class RepositorioClienteMemoria extends RepositorioMemoria<Cliente, String> implements RepositorioCliente {
    public void salvar(Cliente cliente) {
        salvar(cliente.getId(), cliente, "Cliente " + cliente.getNome());
    }
}
