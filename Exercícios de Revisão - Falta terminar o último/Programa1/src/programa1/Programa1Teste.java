/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa1;

/**
 *
 * @author douglas.pereira
 */
public class Programa1Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa p = new Pessoa();
        p.nome = "Zeca";
        p.idade = 23;
        p.fazAniversario();
        System.out.println("idade: " + p.idade);
        p.fazAniversario();
        System.out.println("idade: " + p.idade);
        p.fazAniversario();
        System.out.println("idade: " + p.idade);
    }
    
}
