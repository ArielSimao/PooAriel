/*
 * Aulas professor Maromo.
 */
package questao2;

import java.util.Scanner;

/**
 *
 * @author maromo
 */
public class Questao2 {

    /**
     * @param args the command line arguments
     */
    
    public void imprimir(){
        System.out.println("Olá");
    }
    public void imprimir(String nome){
        System.out.println("Olá " + nome);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Questao2 obj = new Questao2();
        System.out.println("Impressão do olá normal");
        obj.imprimir();
        System.out.println("Digite seu nome");
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        obj.imprimir(nome);
        
        
    }
    
}
