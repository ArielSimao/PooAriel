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
public class Casa {
    public String cor;
    public Porta porta1;
    public Porta porta2;
    public Porta porta3;
    
    public void pinta(String s){
        this.cor = s;
    }
    public int quantasPortasEstaoAbertas(){
        int qtd=0;
        if(porta1.estaAberta())qtd++;
        if(porta2.estaAberta())qtd++;
        if(porta3.estaAberta())qtd++;
        return qtd;
    }
    //criado para facilitar o entendimento
    public void imprimir(){
        System.out.println("Características da casa");
        System.out.println("-----------------------");
        System.out.println("Cor da casa: " + cor);
        System.out.println("PORTA 1");
        this.porta1.imprimir();
        System.out.println("PORTA 2");
        this.porta2.imprimir();
        System.out.println("PORTA 3");
        this.porta3.imprimir();
        
        
    }
}
