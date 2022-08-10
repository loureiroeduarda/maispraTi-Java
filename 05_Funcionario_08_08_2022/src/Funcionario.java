public class Funcionario {
    private String nome;
    private String cargo;
    private String setor;

    public Funcionario(String nome, String cargo, String setor) {
        this.nome = nome;
        this.cargo = cargo;
        this.setor = setor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public String toString() {
        return "Funcionário" + "\n" +
                "Nome: " + nome + "\n" +
                "Cargo: " + cargo + "\n" +
                "Setor: " + setor;
    }
}
