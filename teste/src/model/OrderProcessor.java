package model;

public class OrderProcessor {
    public void process(String clientName, String clientAddress, Item[] items, String paymentType) {
        if (clientName == null || clientName.isEmpty() || clientAddress == null || clientAddress.isEmpty()) {
            System.out.println("Erro: Dados do cliente inválidos.");
            return;
        }

        double total = 0;
        for (int i = 0; i < items.length; i++) {
            total += items[i].price * items[i].q;
        }

        if (paymentType.equals("CreditCard")) {
            double desconto = total * 0.05;
            total = total - desconto;
        } else if (paymentType.equals("BankSlip")) {
            double desconto = total * 0.10;
            total = total - desconto;
        }

        System.out.println("Pedido para " + clientName + " salvo com sucesso!");
        System.out.println("Endereço de entrega: " + clientAddress);
        System.out.println("Valor total: " + total);
    }
}
