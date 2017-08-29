package aula2302b;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aula2302b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        int soma;
        System.out.println("Digite vlr de a: ");
        a = Integer.parseInt(sc.nextLine());
        System.out.println("Digite nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite vlr de b: ");
        b = Integer.parseInt(sc.nextLine());
        soma = a + b;
        System.out.println("Soma: " + soma);
        List lista = new ArrayList();
        lista.add("MAromo");
        lista.add("Pc");
        lista.add("Rita");
        for (Object item : lista) {
            System.out.println(item); 
        }
    }
    
}
