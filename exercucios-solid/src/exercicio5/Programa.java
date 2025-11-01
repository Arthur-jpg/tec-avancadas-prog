package exercicio5;

public class Programa {
    public static void main(String[] args) {
        AveVoadora aguia = new Aguia();
        aguia.voar();
        
        Pinguim pinguim = new Pinguim();
        pinguim.nadar();
        pinguim.mover();
    }
}
