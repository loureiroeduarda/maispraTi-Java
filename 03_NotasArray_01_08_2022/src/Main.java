public class Main {
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno("Eduarda", "0097081");

        aluno01.inserirNotas(1, 30.5);
        aluno01.inserirNotas(2, 30);
        aluno01.inserirNotas(3, 100);

        System.out.println("\n" + aluno01);
    }
}