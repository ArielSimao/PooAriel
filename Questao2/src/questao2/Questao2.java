
package questao2;

import java.util.Scanner;

public class Questao2 {

    public void imprimir(){
        System.out.println("Olá");
    }
    public void imprimir(String nome){
        System.out.println("Olá " + nome);
    }
    public static void main(String[] args) {
        
        Questao2 obj = new Questao2();
        System.out.println("Impressão do olá normal");
        obj.imprimir();
        System.out.println("Digite seu nome");
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        obj.imprimir(nome);
        
        
    }
    
}
