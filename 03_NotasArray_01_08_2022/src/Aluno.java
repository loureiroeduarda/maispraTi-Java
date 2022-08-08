import java.util.Arrays;

public class Aluno {
    private String nome;
    private String matricula;
    private double[] notas = new double[3];

    public Aluno(String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;
    }
    public void inserirNotas(int prova, double novaNota) {
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        if (soma + novaNota > 100) {
            System.out.println("O somatório das notas é maior que 100. Insira novamente uma nota");
        } else {
            if(prova == 1){
                notas[0] = novaNota;
                System.out.println("Nota da primeira prova: " + notas[0]);
            }
            if(prova == 2){
                notas[1] = novaNota;
                System.out.println("Nota da segunda prova: " + notas[1]);
            }
            if(prova == 3){
                notas[2] = novaNota;
                System.out.println("Nota da terceira prova: " + notas[2]);
            }
        }

    }

    @Override
    public String toString() {
        return "ALUNO" + "\n" +
                "Nome: " + nome + '\n' +
                "Matricula: " + matricula + '\n' +
                "Notas: " + Arrays.toString(notas);
    }
}

