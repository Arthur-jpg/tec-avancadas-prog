package sobrescrita;

public class Programa {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.emitirSom());

        Cachorro cachorro = new Cachorro();
        System.out.println(cachorro.emitirSom());

        Gato gato = new Gato();
        System.out.println(gato.emitirSom());
    }
}
