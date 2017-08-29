package aula2302conversao;

import java.util.Scanner;

public class ConversaoTeste {

    public static void main(String[] args) {
        int x = 12;
        float valor = 12.3f;
        String strValor = "120";
        int soma = x + Integer.parseInt(strValor);
        System.out.println(soma);
        String soma2 = Integer.toString(x) + strValor;
        System.out.println(soma2);
        float media = (x + 5) / 2f;
        System.out.println(media);
        //Recebendo dados de entrada via teclado
        String nome;
        double pagto;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        nome =  sc.nextLine();
        System.out.println("Digite o vlr do pagto: ");
        pagto = Double.parseDouble(sc.nextLine());
        System.out.println("Nome: " + nome);
        System.out.println("Valor: " + pagto);
        //for para a tabuada do 7
        for (int i = 1; i <= 10; i++) {
            if(i % 5 == 0)continue;
            x = i * 7;
            System.out.println(x);
        }
        while(x != 23){
            System.out.println(x--);
        }
        
    }
    
}
