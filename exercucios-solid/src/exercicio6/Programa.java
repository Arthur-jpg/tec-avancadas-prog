package exercicio6;

public class Programa {
    public static void main(String[] args) {
        VeiculoMotorizado carro = new Carro();
        carro.acelerar();
        carro.mover();
        
        Bicicleta bicicleta = new Bicicleta();
        bicicleta.pedalar();
        bicicleta.mover();
    }
}
