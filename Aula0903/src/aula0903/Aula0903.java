package aula0903;

import java.util.Scanner;

public class Aula0903 {

    public Cliente lista[];
    public int p;

    public Aula0903() {
        lista = new Cliente[5];
        p = 0;
    }

    public static void main(String[] args) {
        Aula0903 gerenciar = new Aula0903();
        int opc = 0;
        Scanner sc = new Scanner(System.in);
        while (opc != 9) {
            System.out.println("1..Cadastrar");
            System.out.println("2..Listar Todos");
            System.out.println("3..Procurar");
            System.out.println("9.. SAIR");
            System.out.println("Escolha sua opcao: ");
            opc = Integer.parseInt(sc.nextLine());
            switch (opc) {
                case 1:
                    gerenciar.cadastrar();
                    break;
                case 2:
                    gerenciar.listarTodos();
                    break;
                case 3:
                    gerenciar.procurar();
                    break;
                case 9:
                    System.out.println("FIM");
                    break;
                default:
                    System.out.println("Opção invalida");    
            }
        }
    }

    public void cadastrar() {
        if(p<lista.length){
            lista[p] = new Cliente();
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o codigo: ");
            int cod = Integer.parseInt(sc.nextLine());
            lista[p].setCodigo(cod);
            System.out.println("Digite o nome: ");
            lista[p].setNome(sc.nextLine());
            System.out.println("Cadastrado com sucesso");
            p++;
        }else{
            System.out.println("Acabou espaço");
        }
    }

    public void listarTodos() {
        for (Cliente item : lista) {
            if (item!=null) item.imprimir();
        }
    }

    public void procurar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o codigo do cliente "
                + "a ser encontrado");
        int procurado = Integer.parseInt(sc.nextLine());
        for (Cliente item : lista) {
            if(item!=null){
                if(item.getCodigo()==procurado){
                    item.imprimir();
                    return;
                }
            }
        }
    }

}
