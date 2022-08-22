public class Professor {
    private String nomeProfessor;
    private String disciplina;

    public Professor(String nomeProfessor, String disciplina) {
        this.nomeProfessor = nomeProfessor;
        this.disciplina = disciplina;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nomeProfessor + "\n" +
                "Disciplina: " + this.disciplina + "\n";
    }
}
