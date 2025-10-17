package exercicio1;

public class Cadastro {

    private Validacao validacao;
    private ServiçoEmail serviçoEmail;

    public Cadastro(Validacao validacao, ServiçoEmail serviçoEmail) {
        this.validacao = validacao;
        this.serviçoEmail = serviçoEmail;
    }

    public void cadastrarUsuario (Usuario usuario) {
        if (!validacao.validarSenha(usuario.getSenha())) {
            System.out.println("Senha invalida");
        }
        System.out.println("Usuario cadastrado com sucesso: " + usuario.getNome());
        serviçoEmail.enviarEmailDeBoasVindas(usuario.getEmail());
    }
}
