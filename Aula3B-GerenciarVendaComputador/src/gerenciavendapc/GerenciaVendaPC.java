
package gerenciavendapc;
import java.util.Scanner;

public class GerenciaVendaPC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Computador pc = new Computador();
        System.out.println("Escolha a marca");
        pc.setMarca(sc.nextLine());
        System.out.println("Escolha a modelo");
        pc.setModelo(sc.nextLine());
        System.out.println("Escolha a cor ");
        pc.setCor(sc.nextLine());
        System.out.println("Escolha a número de série");
        pc.setNumeroSerie(Long.parseLong(sc.nextLine()));
        System.out.println("Qual o preço?");
        pc.setPreco(Double.parseDouble(sc.nextLine()));
        System.out.println("-------------------------------");
        //pc.imprimir();
        pc.calculaValor();
        pc.imprimir();
        
        Computador pc2 = new Computador();
        System.out.println("Escolha a marca");
        pc2.setMarca(sc.nextLine());
        System.out.println("Escolha a modelo");
        pc2.setModelo(sc.nextLine());
        System.out.println("Escolha a cor ");
        pc2.setCor(sc.nextLine());
        System.out.println("Escolha a número de série");
        pc2.setNumeroSerie(Long.parseLong(sc.nextLine()));
        System.out.println("Qual o preço?");
        pc2.setPreco(Double.parseDouble(sc.nextLine()));
        System.out.println("---------------------------------------");
        //pc2.imprimir();
        pc2.calculaValor();
        pc2.imprimir();
        System.out.println("Escolha o novo preço ");
        if (pc2.alteraValor(Double.parseDouble(sc.nextLine())) == 1)
            System.out.println("Preço alterado com Sucesso!");
        else
            System.out.println("Preço não alterado!");
        pc2.imprimir();
        
    }
    
}
