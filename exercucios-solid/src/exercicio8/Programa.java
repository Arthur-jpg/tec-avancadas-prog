package exercicio8;

public class Programa {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.andar();
        cachorro.nadar();
        
        System.out.println();
        
        Pato pato = new Pato();
        pato.voar();
        pato.nadar();
        pato.andar();
    }
}
