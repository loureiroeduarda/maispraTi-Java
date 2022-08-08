public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void inserirNotas(double[] notas) {
        for (int i = 0; i < notas.length; i++) {
            if (i == 0) {
                if (notas[i] <= 30) {
                    nota1 = notas[i];
                } else {
                    System.out.println("Nota 01 inválida");
                }
            } else if (i == 1) {
                if (notas[i] <= 30) {
                    nota2 = notas[i];
                } else {
                    System.out.println("Nota 02 inválida");
                }
            } else {
                if (notas[i] <= 40) {
                    nota3 = notas[i];
                } else {
                    System.out.println("Nota 03 inválida");
                }
            }
        }
    }

    public String retornarNome() {
        return nome;
    }

    public double retornarNota1() {
        return nota1;
    }

    public double retornarNota2() {
        return nota2;
    }

    public double retornarNota3() {
        return nota3;
    }

    public double media() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public double maiorNota() {
        double maiorNota = nota1;
        if (nota2 > maiorNota) {
            maiorNota = nota2;
        }
        if (nota3 > maiorNota) {
            maiorNota = nota3;
        }
        return maiorNota;
    }

    public double menorNota() {
        double menorNota = nota1;
        if (nota2 < menorNota) {
            menorNota = nota2;
        }
        if (nota3 < menorNota) {
            menorNota = nota3;
        }
        return menorNota;
    }

    public String toString() {
        return "Aluno: " + retornarNome() + "\n"
                + "Nota 01: " + retornarNota1() + "\n"
                + "Nota 02: " + retornarNota2() + "\n"
                + "Nota 03: " + retornarNota3() + "\n"
                + "Media final: " + media() + "\n"
                + "Maior nota: " + maiorNota() + "\n"
                + "Menor nota: " + menorNota();
    }
}
