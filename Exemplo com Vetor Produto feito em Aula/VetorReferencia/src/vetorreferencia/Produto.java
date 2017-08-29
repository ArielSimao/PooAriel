package vetorreferencia;

import java.util.Scanner;


public class Produto {
    public int codigo;
    public String nome;
    public double valor;
    
    //Método imprimir
    public void imprimir(){
        System.out.println("Codigo: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Valor: " + valor);
        System.out.println("--------------------");
    }
    
    //Método para leitura via teclado
    public void lerDoTeclado(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os dados pedidos");
        System.out.println("Nome: ");
        nome = sc.nextLine();
        System.out.println("Código do Produto: ");
        codigo = Integer.parseInt(sc.nextLine());
        System.out.println("Valor: ");
        valor = Double.parseDouble(sc.nextLine());
        System.out.println("Entrada Registrada");
        System.out.println("------------------");
    }
}
