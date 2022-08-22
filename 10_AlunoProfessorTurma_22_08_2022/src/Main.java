public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Fernando", "002365");
        Aluno aluno2 = new Aluno("Joana", "003695");
        Professor professor = new Professor("Ricardo", "Matemática");
        Turma turma = new Turma(professor);

        turma.adicionaAluno(aluno1);
        turma.adicionaAluno(aluno2);

        System.out.println(turma);

    }
}