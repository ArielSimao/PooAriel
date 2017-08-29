package aula0903;

import java.util.Random;

public class Aula0903Teste {

    public static void main(String[] args) {
        // TODO code application logic here
        int v[] = new int[10];
        
        //Atribuir valores
        Random r = new Random(); //Gerar randomico
        for (int i = 0; i < v.length; i++) {
            v[i] = r.nextInt(1000);
        }
        //Percorrer
        for (int i = 0; i < v.length; i++) {
            System.out.printf("Pos: %d = %d\n", i, v[i]);
        }
        
    }
    
}
