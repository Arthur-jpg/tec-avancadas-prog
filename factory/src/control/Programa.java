package control;

import model.A;
import model.Transporte;
import model.TransporteTerrestre;
import model.Veiculo;

public class Programa {
    public static void main(String[] args) {
        Transporte transporte = new TransporteTerrestre();
        Veiculo v = transporte.criarVeiculo();
        v.mover();

        A testea = new A();
        B testeB = new B();
        testeB.

    }
}