package gerenciarvolei;

public class Time {
    private int idTime;
    private String nome;
    private int qtdJogadores;
    public Jogador[] jogadores;

    public int getIdTime() {
        return idTime;
    }

    public void setIdTime(int idTime) {
        this.idTime = idTime;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdJogadores() {
        return qtdJogadores;
    }

    public void setQtdJogadores(int qtdJogadores) {
        this.qtdJogadores = qtdJogadores;
    }

       
    public void adicionarJogador(Jogador j, int p){
        if(this.jogadores[p]==null){
            this.jogadores[p] = j;
        }else{
            System.out.println("Já tem jogador alocado");
        }
    }
    public void listarTodosJogadores(){
        for (Jogador item : jogadores) {
            if(item!=null){
                item.imprimir();
            }
        }
    }
    public void listarAlternativo(){
        for (int i = 0; i < jogadores.length; i++) {
            if(jogadores[i]!=null){
                jogadores[i].imprimir();
            }
        }
    }
    
    
}
