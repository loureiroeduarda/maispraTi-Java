import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Para iniciar o jogo entre com as coordenadas x,y - utilizando valores entre 1 e 9." + "\n" + "Para encerrar o jogo digite FIM.");

        String coordenadas = "";

        while (true) {
            coordenadas = entrada.nextLine();
            if (coordenadas.contains("FIM"))
                break;
            if (coordenadas.matches("[A-Z-a-z]*")) {
                System.out.println("Coordenada inválida! Digite nova coordenada.");
                continue;
            }

            String[] textoSeparado = coordenadas.split(",");

            int x = Integer.parseInt(textoSeparado[0]);
            int y = Integer.parseInt(textoSeparado[1]);
            if (x >= 10 || y >= 10) {
                System.out.println("Coordenada inválida");
            }
        }

    }
}