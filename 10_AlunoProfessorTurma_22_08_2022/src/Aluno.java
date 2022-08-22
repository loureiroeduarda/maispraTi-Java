public class Aluno {
    private String nome;
    private String matricula;
    private String endereco;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String imprimeEndereco() {
        if (this.endereco == null) {
            return "";
        }
        return "Endereço: " + this.endereco;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "\n" +
                "Matrícula: " + this.matricula + "\n" +
                imprimeEndereco();
    }
}
