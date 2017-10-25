
package questao6;
 
public class Time {
    private int idTime;
    private String nomeTime;
    private Jogador[] jogador;

    public int getIdTime() {
        return idTime;
    }

    public void setIdTime(int idTime) {
        this.idTime = idTime;
    }

    public String getNomeTime() {
        return nomeTime;
    }

    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    public Jogador[] getJogador() {
        return jogador;
    }

    public void setJogador(Jogador[] jogador) {
        this.jogador = jogador;
    }
    
    public void listarJogadores(){
        for(Jogador j : jogador){
            if(j!=null){
                System.out.println("Nome do Jogador: " + j.getNomeJogador());
                System.out.println("Posicao do Jogador: " + j.getPosicao());
            }
        }
    }
    //Questao 7
    //Atrib Estático: carregado na JVM, atributo compartilhado entre
    //todos os objetos do mesmo tipo.
    //Objeto: Instância de uma Classe
    //Classe: Molde para representar um objeto
    //Construtores: método responsável pela criação do objeto na memória
    //heap
}
