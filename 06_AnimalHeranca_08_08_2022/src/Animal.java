public class Animal {
    protected String nome;
    protected String especie;
    protected double peso;
    protected int idade;

    public Animal(String nome, String especie, double peso, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.peso = peso;
        this.idade = idade;
    }

    public Animal() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void somEmitido() {
        System.out.println("Não emite som.");
    }

    @Override
    public String toString() {
        return "Animal" + "\n" +
                "Nome: " + nome + "\n" +
                "Espécie: " + especie + "\n" +
                "Peso: " + peso + "\n" +
                "Idade: " + idade;
    }
}
