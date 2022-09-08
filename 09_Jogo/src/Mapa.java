public class Mapa {
    int[][] mapaInimigo;
    Elemento[] elementos;
    int inimigosRestantes;
    int disparosRestantes;

    public Mapa() {
        this.mapaInimigo = new int[10][10];
        this.elementos = new Elemento[5];
        this.inimigosRestantes = 5;
        this.disparosRestantes = 25;
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
        System.out.println("====================================================");
        System.out.println("Inimigos restantes: " + this.inimigosRestantes);
        System.out.println("Disparos restantes: " + this.disparosRestantes);
        System.out.println("====================================================");
    }

    public boolean disparo(int x, int y) {
        if (this.inimigosRestantes == 0) {
            System.out.println("Os inimigos foram encontrados!! Você venceu!!");
            return false;
        }
        if (this.disparosRestantes == 0) {
            System.out.println("Sua munição terminou!! Game over!!");
            return false;
        }
        double menorDistancia = 1000;
        for (Elemento elemento : elementos) {
            if (elemento.isVivo()) {
                double resultadoDistancia = elemento.caculaDistancia(x, y);
                menorDistancia = (resultadoDistancia < menorDistancia) ? resultadoDistancia : menorDistancia;
            }
        }
        System.out.println("A distância do inimigo é: " + menorDistancia);
        System.out.println("====================================================");
        this.mapaInimigo[y][x] = (menorDistancia > 0) ? 1 : 2;
        if (menorDistancia == 0) {
            this.inimigosRestantes--;
        }
        this.disparosRestantes--;
        return true;
    }

    public void gerarElementos() {
        for (int i = 0; i < this.elementos.length; i++) {
            this.elementos[i] = new Elemento();
        }
    }
}
