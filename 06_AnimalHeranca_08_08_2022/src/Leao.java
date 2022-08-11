public class Leao extends Animal {
    public Leao(String nome, String especie, double peso, int idade) {
        super(nome, especie, peso, idade);
    }

    public Leao() {
    }

    @Override
    public void somEmitido() {
        System.out.println("O som emitido pelo leão é o rugido");
    }


}
