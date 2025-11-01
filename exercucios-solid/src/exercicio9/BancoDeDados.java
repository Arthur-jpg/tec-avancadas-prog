package exercicio9;

public class BancoDeDados implements Repositorio {
    public void salvar(String dados) {
        System.out.println("Salvando no banco: " + dados);
    }
}
