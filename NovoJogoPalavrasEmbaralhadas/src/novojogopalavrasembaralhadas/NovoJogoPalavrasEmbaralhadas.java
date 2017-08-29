
package novojogopalavrasembaralhadas;

import java.util.Scanner;

public class NovoJogoPalavrasEmbaralhadas {
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MecanicaDoJogo mj = FabricaMecanicaDoJogo.getMecanicaDoJogo();
        
        System.out.println("------Bem Vindo ao Jogo Palavras Embaralhadas------");
        System.out.println("Modalidade--> "+mj.getNome());
        System.out.println("Descrição--> "+mj.getDescricao());
        
        while(!mj.acabou()){
            String palavra = mj.getPalavraEmbaralhada(); 
            System.out.println("Tente Acertar "+palavra);
            String tentativa = sc.nextLine();
            System.out.println(mj.getSituacao(tentativa, mj.getPalavra()));
        }
        System.out.println("---------------------------------");
        System.out.println("Voce acertou---> "+mj.getAcertos());
    }
    
}
