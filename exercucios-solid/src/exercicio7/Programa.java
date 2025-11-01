package exercicio7;

public class Programa {
    public static void main(String[] args) {
        Desenvolvedor dev = new Desenvolvedor();
        dev.trabalhar();
        dev.programar();
        
        System.out.println();
        
        Entregador entregador = new Entregador();
        entregador.trabalhar();
        entregador.dirigir();
    }
}
