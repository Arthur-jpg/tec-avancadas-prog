package sobrecarga;

public class Programa {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.somar(1,2));
        System.out.println(calculadora.somar(1.3, 2.3));
        System.out.println(calculadora.somar(1,2,3));
        System.out.println(calculadora.somar(1.3,2.3,3.3));
    }
}
