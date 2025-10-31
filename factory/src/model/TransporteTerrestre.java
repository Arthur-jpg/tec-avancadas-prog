package model;

public class TransporteTerrestre extends Transporte {
    public Veiculo criarVeiculo() {
        return new Carro();
    }
}