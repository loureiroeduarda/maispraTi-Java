import java.util.Arrays;

public class Mapa {
    int [][] mapaInimigo;

    public Mapa() {
        this.mapaInimigo = new int[10][10];
    }

    public void imprimiLinha(int[] linha){
        String strLinha = "";
        for(int item : linha){
            strLinha += item;
        }
        System.out.println(strLinha);
    }
    public void imprimiMapa() {
        for (int[] linha : this.mapaInimigo){
            this.imprimiLinha(linha);
        }
    }
}
