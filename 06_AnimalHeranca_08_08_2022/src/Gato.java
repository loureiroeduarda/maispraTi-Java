public class Gato extends Animal{
    public Gato(String nome, String especie, double peso, int idade) {
        super(nome, especie, peso, idade);
    }

    public Gato() {
    }

    @Override
    public void somEmitido() {
        System.out.println("O som emitido pelo Gato é o miado");
    }
}
