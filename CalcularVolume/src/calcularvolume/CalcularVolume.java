package calcularvolume;

import java.util.Scanner;

public class CalcularVolume {

    public static void main(String[] args) {
        Esfera esfera = new Esfera();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do Raio: ");
        esfera.setRaio(Double.parseDouble(sc.nextLine()));
        System.out.println("Volume da Esfera: " + esfera.getVolume());
    }
    
}
