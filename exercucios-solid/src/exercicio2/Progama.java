package exercicio2;


// Classe principal para executar o programa
public class Progama {
    public static void main(String[] args) {
        Conteudo conteudo1 = new Conteudo();
        Salvador salvarC1 = new Salvador();

        String conteudo = conteudo1.gerar();
        salvarC1.salar(conteudo);
    }
}
