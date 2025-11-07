package desafio;

import java.util.HashMap;
import java.util.Map;

public abstract class RepositorioMemoria<T, ID> {
    protected Map<ID, T> dados = new HashMap<>();

    public void salvar(ID id, T objeto, String tipo) {
        dados.put(id, objeto);
        System.out.println(tipo + " salvo no repositório.");
    }

    public T buscarPorId(ID id) {
        return dados.get(id);
    }
}
