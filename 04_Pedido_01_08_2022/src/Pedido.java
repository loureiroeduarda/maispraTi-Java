public class Pedido {
    private String[] itens = new String[10];
    private StatusDoPedido status;
    private double valorTotal;

    public Pedido() {
        this.status = StatusDoPedido.EFETUADO;
    }

    public String[] getItens() {
        return itens;
    }

    public void setItens(String[] itens) {
        this.itens = itens;
    }

    public StatusDoPedido getStatus() {
        return status;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void carrinho(String item, double valor, int numeroDoItem) {
        itens[numeroDoItem] = item;
        valorTotal += valor;
    }

    public void imprimiPedidos() {
        int i = 0;
        System.out.println("Itens do seu pedido:");
        while (itens[i] != null) {
            System.out.println(itens[i]);
            i++;
        }
    }

    public void imprimiStatus() {
        System.out.println("O status do pedido é: " + status);
    }

    public void setStatus(StatusDoPedido status) {
        this.status = status;
    }
}
