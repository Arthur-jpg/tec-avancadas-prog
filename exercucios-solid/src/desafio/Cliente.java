package desafio;

public class Cliente {
    private String id;
    private String nome;
    private String email;
    private TipoCliente tipo;

    public Cliente(String id, String nome, String email, TipoCliente tipo) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.tipo = tipo;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public TipoCliente getTipo() {
        return tipo;
    }
}
