public class Administrador extends Funcionario {
    private final double BONIFICACAO = 0.06;

    public Administrador(String nome, double valorHora, double totalHora) {
        super(nome, valorHora, totalHora);
    }

    @Override
    public double valorTotalAReceber() {
        double remuneracao = valorHora * totalHora;
        double valorTotalAReceber = (remuneracao * BONIFICACAO) + remuneracao;
        return valorTotalAReceber;
    }

    @Override
    public String toString() {
        return "Administrador" + "\n" +
                "Nome: " + nome + "\n" +
                "Valor da hora: R$ " + valorHora + "\n" +
                "Total de horas: " + totalHora;
    }
}
