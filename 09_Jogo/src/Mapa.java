public class Mapa {
    int[][] mapaInimigo;
    Elemento[] elementos;

    public Mapa() {
        this.mapaInimigo = new int[10][10];
        this.elementos = new Elemento[5];
        gerarElementos();
    }

    public void imprimiLinha(int[] linha) {
        String strLinha = "";
        for (int item : linha) {
            if (item == 0) {
                strLinha += "." + " ";
            } else if (item == 1) {
                strLinha += "X" + " ";
            } else if (item == 2) {
                strLinha += "*" + " ";
            }
        }
        System.out.println(strLinha);
    }

    public void imprimiMapa() {
        for (int[] linha : this.mapaInimigo) {
            this.imprimiLinha(linha);
        }
        for (Elemento elemento : this.elementos) {
            System.out.println(elemento);
        }
    }

    public void disparo(int x, int y) {
        if (x >= 10 || y >= 10) {
            System.out.println("Coordenada inválida! Digite uma nova coordenada.");
        } else {
            this.mapaInimigo[y][x] = 1;
            imprimiMapa();
        }
    }

    public void gerarElementos() {
        for (int i = 0; i < this.elementos.length; i++) {
            this.elementos[i] = new Elemento();
        }
    }

}
