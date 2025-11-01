package desafio;

public interface RepositorioCliente {
    void salvar(Cliente cliente);
    Cliente buscarPorId(String id);
}
