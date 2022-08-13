public abstract class Funcionario {
    protected String nome;
    protected double valorHora;
    protected double totalHora;

    public Funcionario(String nome, double valorHora, double totalHora) {
        this.nome = nome;
        this.valorHora = valorHora;
        this.totalHora = totalHora;
    }

    public abstract double valorTotalAReceber();


}
