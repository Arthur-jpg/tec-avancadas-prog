package desafio;

public class Programa {
    public static void main(String[] args) {
        System.out.println("=".repeat(70));
        System.out.println("SISTEMA DE PEDIDOS");
        System.out.println("=".repeat(70));
        
        RepositorioCliente repositorioCliente = new RepositorioClienteMemoria();
        RepositorioPedido repositorioPedido = new RepositorioPedidoMemoria();
        NotificadorCliente notificador = new NotificadorEmail();
        
        ServicoCadastroCliente servicoCadastro = new ServicoCadastroCliente(repositorioCliente, notificador);
        ServicoPedido servicoPedido = new ServicoPedido(repositorioPedido, notificador);
        ProcessadorPagamento processadorPagamento = new ProcessadorPagamento(notificador);
        
        System.out.println("\nCADASTRANDO CLIENTES\n");
        
        Cliente cliente1 = new Cliente("C001", "João Silva", "joao@email.com", TipoCliente.VIP);
        Cliente cliente2 = new Cliente("C002", "Maria Santos", "maria@email.com", TipoCliente.PREMIUM);
        Cliente cliente3 = new Cliente("C003", "Pedro Oliveira", "pedro@email.com", TipoCliente.REGULAR);
        
        servicoCadastro.cadastrar(cliente1);
        System.out.println();
        servicoCadastro.cadastrar(cliente2);
        System.out.println();
        servicoCadastro.cadastrar(cliente3);
        
        System.out.println("\n" + "=".repeat(70));
        System.out.println("CRIANDO PEDIDO 1 - Cliente VIP");
        System.out.println("=".repeat(70));
        
        Pedido pedido1 = servicoPedido.criarPedido(cliente1);
        pedido1.adicionarItem(new ItemPedido("Notebook Dell", 3500.00, 1));
        pedido1.adicionarItem(new ItemPedido("Mouse Logitech", 150.00, 2));
        pedido1.adicionarItem(new ItemPedido("Teclado Mecânico", 450.00, 1));
        
        System.out.println("\nItens do Pedido:");
        for (ItemPedido item : pedido1.getItens()) {
            System.out.println("  - " + item.getProduto() + " | Qtd: " + item.getQuantidade() + 
                             " | R$ " + String.format("%.2f", item.getSubtotal()));
        }
        
        servicoPedido.finalizarPedido(pedido1);
        
        CalculadoraDesconto calculadora1 = FabricaDesconto.obterCalculadora(cliente1.getTipo());
        MetodoPagamento pagamento1 = new PagamentoCartaoCredito("1234567812345678");
        processadorPagamento.processarPagamento(pedido1, pagamento1, calculadora1);
        
        System.out.println("\n" + "=".repeat(70));
        System.out.println("CRIANDO PEDIDO 2 - Cliente PREMIUM");
        System.out.println("=".repeat(70));
        
        Pedido pedido2 = servicoPedido.criarPedido(cliente2);
        pedido2.adicionarItem(new ItemPedido("Smartphone Samsung", 2500.00, 1));
        pedido2.adicionarItem(new ItemPedido("Fone Bluetooth", 300.00, 1));
        
        System.out.println("\nItens do Pedido:");
        for (ItemPedido item : pedido2.getItens()) {
            System.out.println("  - " + item.getProduto() + " | Qtd: " + item.getQuantidade() + 
                             " | R$ " + String.format("%.2f", item.getSubtotal()));
        }
        
        servicoPedido.finalizarPedido(pedido2);
        
        CalculadoraDesconto calculadora2 = FabricaDesconto.obterCalculadora(cliente2.getTipo());
        MetodoPagamento pagamento2 = new PagamentoPix("maria@email.com");
        processadorPagamento.processarPagamento(pedido2, pagamento2, calculadora2);
        
        System.out.println("\n" + "=".repeat(70));
        System.out.println("CRIANDO PEDIDO 3 - Cliente REGULAR");
        System.out.println("=".repeat(70));
        
        Pedido pedido3 = servicoPedido.criarPedido(cliente3);
        pedido3.adicionarItem(new ItemPedido("Livro Java Avançado", 89.90, 2));
        pedido3.adicionarItem(new ItemPedido("Caderno", 25.00, 3));
        
        System.out.println("\nItens do Pedido:");
        for (ItemPedido item : pedido3.getItens()) {
            System.out.println("  - " + item.getProduto() + " | Qtd: " + item.getQuantidade() + 
                             " | R$ " + String.format("%.2f", item.getSubtotal()));
        }
        
        servicoPedido.finalizarPedido(pedido3);
        
        CalculadoraDesconto calculadora3 = FabricaDesconto.obterCalculadora(cliente3.getTipo());
        MetodoPagamento pagamento3 = new PagamentoBoleto();
        processadorPagamento.processarPagamento(pedido3, pagamento3, calculadora3);
    }
}
