package exercicio1;

// Classe principal para executar o programa
public class Programa {
    public static void main(String[] args) {
        Validacao validador = new Validacao();
        ServiçoEmail emailService = new ServiçoEmail();
        Cadastro cadastro = new Cadastro(validador, emailService);

        Usuario u = new Usuario("Ana", "ana@email.com", "12345678");
        cadastro.cadastrarUsuario(u);
    }
}
