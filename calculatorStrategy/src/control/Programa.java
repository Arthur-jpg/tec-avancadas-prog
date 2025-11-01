package control;

import model.Calculadora;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a operação (+, -, *, /): ");
        String op = sc.nextLine();

        System.out.print("Digite o primeiro número: ");
        double a = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double b = sc.nextDouble();

        double resultado = calc.calcular(op, a, b);
        System.out.println("Resultado: " + resultado);
        
        sc.close();
    }
}
