import java.util.ArrayList;

public class Turma {
    private Professor professor;
    private ArrayList<Aluno> listaDeAlunos;

    public Turma(Professor professor) {
        this.professor = professor;
        this.listaDeAlunos = new ArrayList<>();
    }

    public void adicionaAluno(Aluno novoAluno) {
        listaDeAlunos.add(novoAluno);
    }

    public String imprimeAluno() {
        String todosAlunos = "";
        for (Aluno aluno : listaDeAlunos) {
            todosAlunos += aluno.toString();
        }
        return todosAlunos;
    }

    @Override
    public String toString() {
        return "Turma:" + "\n" +
                "Professor: " + "\n" + this.professor + "\n" +
                "Alunos: " + "\n" + this.imprimeAluno() + "\n";
    }
}
