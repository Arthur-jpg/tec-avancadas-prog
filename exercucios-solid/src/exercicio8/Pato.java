package exercicio8;

public class Pato implements Voador, Nadador, Andador {
    public void voar() {
        System.out.println("Pato voando...");
    }
    
    public void nadar() {
        System.out.println("Pato nadando...");
    }
    
    public void andar() {
        System.out.println("Pato andando...");
    }
}
