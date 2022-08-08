public class Main {
    public static void main(String[] args) {
        //EXERCÍCIO: Criar um método na classe pedido para remover um item.
        //Comparar o item que se deseja remover com os itens da lista.

        Pedido pedido01 = new Pedido();

        pedido01.carrinho("Camiseta", 59.90, 0);
        pedido01.carrinho("Calça", 89.90, 1);
        pedido01.imprimiPedidos();

        pedido01.setStatus(StatusDoPedido.DESPACHADO);
        pedido01.imprimiStatus();

        System.out.println("O valor total do pedido é: R$ " + pedido01.getValorTotal());
    }
}