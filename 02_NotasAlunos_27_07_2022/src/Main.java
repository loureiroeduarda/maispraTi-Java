public class Main {
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno("Eduarda");

        double[] notas = {20, 30, 550};
        aluno01.inserirNotas(notas);
        System.out.println(aluno01 + "\n");


        Aluno aluno02 = new Aluno("Matheus");

        double[] notas02 = {20, 25, 50};
        aluno02.inserirNotas(notas02);
        System.out.println(aluno02);

    }
}