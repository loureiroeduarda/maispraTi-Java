public class Jogador {
    private String nome;
    private int gols;
    private int assistencias;

    public void adicionarGol (int quantidadeDeGols){
        gols += quantidadeDeGols;
    }

    public void adicionarAssistencia (int quantidadeDeAssistencias){
        assistencias += quantidadeDeAssistencias;
    }

    public int mostrarGols (){
        return gols;
    }

    public int mostrarAssistencias (){
        return assistencias;
    }
}
