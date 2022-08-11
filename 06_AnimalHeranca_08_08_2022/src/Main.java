public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();

        Animal leao = new Leao("Mufasa", "Felino", 190.00, 6);
        System.out.println(leao);
        leao.somEmitido();

        System.out.println();
        Animal gato = new Gato("Algodão", "Felino", 4.50, 3);
        System.out.println(gato);
        gato.somEmitido();

        System.out.println();
        Animal onca = new Onca("Juma", "Felino", 80.00, 10);
        System.out.println(onca);
        onca.somEmitido();

    }
}