/*
 * Aulas professor Maromo.
 */
package tictactoe.utils;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author maromo
 */
public class Util {
    
    
    //Método estático para limpar os botões
    public static void limparBotoes(JPanel painel){
        for (Component componente : painel.getComponents()) {
            if(componente instanceof JButton){
                JButton botao = (JButton) componente;
                if(!botao.getText().equals("Novo Jogo")){
                        botao.setText("");
                }
            }
        }
    }
}
