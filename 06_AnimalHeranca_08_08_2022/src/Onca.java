public class Onca extends Animal{
    public Onca(String nome, String especie, double peso, int idade) {
        super(nome, especie, peso, idade);
    }

    public Onca() {
    }

    @Override
    public void somEmitido() {
        System.out.println("O som emitido pelo onça é o esturro");
    }
}
