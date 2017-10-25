
package questao1;

import java.util.Scanner;
public class Questao1 {

    public static void main(String[] args) {
        
        //5 a)
        Computador c1 = null, c2 = null;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            Computador x = new Computador();
            System.out.println("Digite o id: ");
            x.setIdComp(Integer.parseInt(sc.nextLine()));
            System.out.println("Digite o nome: ");
            x.setDescricao(sc.nextLine());
            System.out.println("Digite o valor: ");
            x.setValor(Double.parseDouble(sc.nextLine()));
            if (i == 0) {
                c1 = x;
            }
            if (i == 1) {
                c2 = x;
            }
        }
        //5 b)
        Usuario u = new Usuario();
        u.setNivel(2);

        //5 c)
        if (c1 != null) {
            if (c1.atualizarPreco(u, 1000.0) == 0) {
                System.out.println("Preco do c1 atualizado");
            } else {
                System.out.println("Preco do c1 não atualizado");
            }
        }
        if (c2 != null) {
            if (c2.atualizarPreco(u, 2000.0) == 0) {
                System.out.println("Preco do c2 atualizado");
            } else {
                System.out.println("Preco do c2 nao atualizado");
            }
        }
        //5 d)
        c1.listarDados();
        c2.listarDados();
    }

}
