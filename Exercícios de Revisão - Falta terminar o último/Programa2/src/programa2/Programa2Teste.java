/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa2;

/**
 *
 * @author douglas.pereira
 */
public class Programa2Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Porta p1 = new Porta();
        p1.abre();
        p1.fecha();
        p1.pinta("azul");
        p1.pinta("vermelha");
        p1.dimensaoX = 180;
        p1.dimensaoY = 90;
        p1.dimensaoZ = 120;
        //p1.imprimir();//alterado para o dois
        ///Para o programa alterado
        //Criar uma casa e mais duas portas
        Porta p2 = new Porta();
        p2.dimensaoX = 100;
        p2.dimensaoY = 120;
        p2.dimensaoZ = 10;
        p2.pinta("marrom");
        p2.fecha();
        Porta p3 = new Porta();
        p3.dimensaoX = 100;
        p3.dimensaoY = 120;
        p3.dimensaoZ = 10;
        p3.pinta("verde");
        p3.abre();
        Casa casa = new Casa();
        casa.cor = "azul";
        casa.pinta("Novo Azul");
        casa.porta1 = p1;
        casa.porta2 = p2;
        casa.porta3 = p3;
        casa.imprimir();
        System.out.println("Quantidade de portas abertas: " + 
                casa.quantasPortasEstaoAbertas());
        
    }
    
}
