package gerenciarvolei;

public class GerenciarVolei {


    public static void main(String[] args) {
        //Definir um time com 4 jogadores
        Time t = new Time();
        t.setIdTime(1);
        t.setNome("Osasco");
        t.setQtdJogadores(4);
        t.jogadores = new Jogador[t.getQtdJogadores()];
        //Criar 2 jogadores
        Jogador j1 = new Jogador();
        j1.setId(1);
        j1.setNome("Oscar");
        Jogador j2 = new Jogador();
        j2.setId(2);
        j2.setNome("Serginho");
        t.adicionarJogador(j1, 0); //Coloquei jogador na posicao 0
        t.adicionarJogador(j2, 0);
        //Listar os jogadores
        System.out.println("Lista dos jogadores");
        t.listarTodosJogadores();
        
        
    }
    
}
