package exercicio7;

public class Entregador implements Trabalhador, Motorista {
    public void trabalhar() {
        System.out.println("Trabalhando...");
    }
    
    public void dirigir() {
        System.out.println("Dirigindo...");
    }
}
