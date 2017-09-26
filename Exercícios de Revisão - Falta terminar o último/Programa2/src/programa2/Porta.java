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
public class Porta {

    public boolean aberta;
    public String cor;
    public int dimensaoX;
    public int dimensaoY;
    public int dimensaoZ;

    public void abre() {
        aberta= true;
    }

    public void fecha() {
        aberta =false;
    }

    public void pinta(String s) {
        this.cor = s;
    }

    public boolean estaAberta() {
        return aberta;
    }
    //Criei um imprimir para facilitar a exibição dos dados
    public void imprimir(){
        System.out.println("---> CARACTERISTICAS DA PORTA <----");
        if(aberta){
            System.out.println("Porta Aberta");
        }else{
            System.out.println("Porta Fechada");
        }
        System.out.println("Cor: " + cor);
        System.out.println("Dimensao X: " + dimensaoX);
        System.out.println("Dimensao Y: " + dimensaoY);
        System.out.println("Dimensao Z: " + dimensaoZ);
    }
}
