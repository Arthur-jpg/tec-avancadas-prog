package desafio;

public class NotificadorEmail implements NotificadorCliente {
    public void enviarNotificacao(String email, String mensagem) {
        System.out.println("📧 Enviando e-mail para: " + email);
        System.out.println("Mensagem: " + mensagem);
    }
}
