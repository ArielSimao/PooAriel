package tictactoe;

import tictactoe.view.JVeia;


public class TicTacToe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Chamar o tabuleiro
        JVeia tela = new JVeia();
        tela.setVisible(true);
        tela.setTitle("Jogo da Véia");
    }
    
}
