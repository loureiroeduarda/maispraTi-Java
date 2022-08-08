import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Jogador jogador = new Jogador();

        jogador.adicionarGol(5);
        System.out.println("Quantidade gols do jogador: " + jogador.mostrarGols());

        jogador.adicionarAssistencia(1);
        System.out.println("Quantidade assistências do jogador: " + jogador.mostrarAssistencias());


//        System.out.println("Digite a quantidade de assistências do jogador:");
//        int assistencias = entrada.nextInt();
//
//        System.out.println("");
//        jogador.adicionarAssistencia(assistencias);
//        System.out.println(jogador.mostrarAssistencias());
    }
}