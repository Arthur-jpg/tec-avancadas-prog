package exercicio4;

public class Programa {
    public static void main(String[] args) {
        Forma ciruclo = new Circulo(2);
        Forma retangulo = new Retangulo(2, 2);

        System.out.println(ciruclo.calcularArea());
        System.out.println(retangulo.calcularArea());
    }
}
