public class Main {
    public static void main(String[] args) {
        Pedido pedido01 = new Pedido();
        Item item01 = new Item("Camiseta", 59.90);
        Item item02 = new Item("Calça", 89.90);

        pedido01.adicionarItem(item01);
        pedido01.adicionarItem(item02);
        pedido01.imprimiPedidos();
        System.out.println("O status do pedido é: " + pedido01.getStatus());
        System.out.println("O valor total do pedido é: R$ " + pedido01.getValorTotal());

        System.out.print("\n");

        pedido01.removeItem(item02);
        System.out.println("Item removido com sucesso");

        pedido01.imprimiPedidos();
        pedido01.setStatus(StatusDoPedido.FATURADO);
        System.out.println("O status do pedido é: " + pedido01.getStatus());
        System.out.println("O valor total do pedido é: R$ " + pedido01.getValorTotal());
    }
}