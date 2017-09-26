package projetotabuleiro;

import java.util.Random;
import java.util.Scanner;

public class Tabuleiro {

    private int[][] tabu = new int[10][10];
    private int n1;
    private int n2;

    public Tabuleiro() {
        //Lógica para o sorteio
        //Encher o tabuleiro
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tabu[i][j] = r.nextInt(101);
            }
        }
    }

    public void lerPalpites() {
        //Pedir os valores de n1 e n2 para o usuario
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor para o 1. palpite: ");
        n1 = Integer.parseInt(sc.nextLine());
        System.out.println("Digite o valor para o 2. palpite: ");
        n2 = Integer.parseInt(sc.nextLine());
    }

    public double verificarPremio() {
        //procura pelo n1 e pelo n2 no vetor acumulando os acertos
        int acumulo = 0;
        for (int[] linha : tabu) {
            for (int item : linha) {
                if ((item == n1) || (item == n2)) {
                    acumulo++;
                }
            }
        }
       return acumulo * 1000.0;
    }

    public void exibirTabuleiro() {
        int i = 0;
        for (int[] linha : tabu) {
            for (int valor : linha) {
                System.out.printf("%3d ", valor);
                if (++i == 10) {
                    System.out.println("");
                    i = 0;
                }
            }
        }
    }

}
