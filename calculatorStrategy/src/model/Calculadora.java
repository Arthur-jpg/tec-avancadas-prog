package model;

import java.util.HashMap;
import java.util.Map;

public class Calculadora {
    private final Map<String, Operacao> operacoes = new HashMap<>();

    public Calculadora() {
        operacoes.put("+", new Soma());
        operacoes.put("-", new Subtracao());
        operacoes.put("*", new Multiplicacao());
        operacoes.put("/", new Divisao());
    }

    public double calcular(String operador, double a, double b) {
        Operacao op = operacoes.get(operador);
        return op.executar(a, b);
    }
}
