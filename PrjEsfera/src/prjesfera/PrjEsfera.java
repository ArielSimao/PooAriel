
package prjesfera;

import java.util.Scanner;


public class PrjEsfera {


    public static void main(String[] args) {
        Esfera esfera = new Esfera();
        Scanner sc  = new Scanner(System.in);
        System.out.println("Digite o valor do Raio: ");
        esfera.setRaio(Double.parseDouble(sc.nextLine()));
        System.out.println("Valor do Volume: " + esfera.calcularVolume());
    }
    
}
