/*
 * Aulas professor Maromo.
 */
package projetotabuleiro;

/**
 *
 * @author maromo
 */
public class JogoTabuleiro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tabuleiro t = new Tabuleiro();
        t.lerPalpites();
        double valor = t.verificarPremio();
        t.exibirTabuleiro();
        if (valor>0.0){
            System.out.println("PARABÉNS, seu prêmio é: " + valor);
        }else{
            System.out.println("QUE PENA, sem prêmio");
        }
    }
    
}
