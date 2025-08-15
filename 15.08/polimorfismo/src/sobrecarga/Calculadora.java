package sobrecarga;

public class Calculadora {
    public double somar(double valor1, double valor2) {
        return valor1 + valor2;
    }
    public int somar(int valor1, int valor2) {
        return valor1 + valor2;
    }
    public double somar(double valor1, double valor2, double valor3) {
        return valor1 + valor2 + valor3;
    }
    public int somar(int valor1, int valor2, int valor3) {
        return valor1 + valor2 + valor3;
    }
}
