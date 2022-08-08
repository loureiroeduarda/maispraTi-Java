public class Pedido {
    private Item[] itens = new Item[10];
    private StatusDoPedido status;
    private double valorTotal;

    public Pedido() {
        this.status = StatusDoPedido.EFETUADO;
    }

    public Item[] getItens() {
        return itens;
    }

    public void setItens(Item[] itens) {
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

    public void adicionarItem(Item item) {
        for (int i = 0; i < itens.length; i++) {
            if (itens[i] == null) {
                itens[i] = item;
                valorTotal += item.getValor();
                break;
            }
        }
    }

    public void removeItem(Item item) {
        for (int i = 0; i < itens.length; i++) {
            if (itens[i].equals(item)) {
                itens[i] = null;
                valorTotal -= item.getValor();
                break;
            }
        }
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
