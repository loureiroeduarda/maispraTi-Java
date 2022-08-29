import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Mapa mapaInimigos = new Mapa();

        boolean continuarPartida = true;
        String coordenadas = "";

        while (continuarPartida) {
            System.out.println("Para iniciar o jogo entre com as coordenadas x e y: No formato x,y - utilizando valores entre 0 a 9." + "\n" + "Para encerrar o jogo digite FIM.");
            coordenadas = entrada.nextLine();
            if (coordenadas.equals("FIM"))
                break;
            if (coordenadas.matches("[A-Z-a-z]*")) {
                System.out.println("Coordenada inválida! Digite nova coordenada.");
                continue;
            }

            String[] textoSeparado = coordenadas.split(",");
            int x = Integer.parseInt(textoSeparado[0]);
            int y = Integer.parseInt(textoSeparado[1]);
            System.out.println("Coordenada x = " + x + " e Coordenada y = " + y);
            System.out.println("====================================================");
            mapaInimigos.disparo(x, y);
        }
    }
}