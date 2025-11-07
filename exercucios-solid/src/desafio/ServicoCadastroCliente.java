package desafio;

public class ServicoCadastroCliente {
    private final RepositorioCliente repositorio;
    private final NotificadorCliente notificador;

    public ServicoCadastroCliente(RepositorioCliente repositorio, NotificadorCliente notificador) {
        this.repositorio = repositorio;
        this.notificador = notificador;
    }

    public void cadastrar(Cliente cliente) {
        repositorio.salvar(cliente);
        notificador.enviarNotificacao(cliente.getEmail(), 
            "Bem-vindo " + cliente.getNome() + "! Seu cadastro foi realizado com sucesso.");
    }
}
