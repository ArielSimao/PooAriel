/*
 * Aulas professor Maromo.
 */
package questao3;

/**
 *
 * @author maromo
 */
public class Questao3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0; i < 5 && (i % 2) == 0; i++) {
            System.out.print(" " + i++);
        }
        //Resposta: 0 2 4
    }
    
}
