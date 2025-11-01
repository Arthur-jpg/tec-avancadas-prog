package exercicio3;

public class Programa {
    public static void main(String[] args) {
        Cliente vip = new ClienteVIP();
        Cliente regular = new ClienteRegular();
        Cliente normal = new ClienteNormal();
        
        System.out.println("Desconto VIP: " + vip.calcularDesconto(100));
        System.out.println("Desconto Regular: " + regular.calcularDesconto(100));
        System.out.println("Desconto Normal: " + normal.calcularDesconto(100));
    }
}
