package vetorreferencia;

import java.util.Scanner;

public class VetorReferenciaTeste {

    public Produto[] listaDeProdutos = new Produto[10];
    public int pos = 0; //indica posicao do vetor
    
    public static void main(String[] args) {
        VetorReferenciaTeste vrt = new VetorReferenciaTeste();
        Scanner sc = new Scanner(System.in);
        int opc=0;
        do{
            System.out.println("ESCOLHA A OPÇÃO: ");
            System.out.println("1) Cadastrar");
            System.out.println("2) Listar específico");
            System.out.println("3) Listar todos");
            System.out.println("9) Sair");
            System.out.println("---> ");
            opc = Integer.parseInt(sc.nextLine());
            switch(opc){
                case 1:
                    vrt.executarCadastro();
                    break;
                case 2:
                    System.out.println("Digite o código do produto:");
                    int codigo = Integer.parseInt(sc.nextLine());
                    vrt.procurarProduto(codigo);
                    break;
                case 3:
                    vrt.imprimirLista();
                    break;
                case 9:
                    System.out.println("Fim");
                    break;
                default:
                    System.out.println("Opção Invalida");
            }
        }while(opc!=9);
    }
    
    public void executarCadastro(){
        if(pos<listaDeProdutos.length){
            listaDeProdutos[pos] = new Produto();
            listaDeProdutos[pos].lerDoTeclado();
            pos++;
        }else{
            System.out.println("Posições completadas");
        }
    }
    public void procurarProduto(int codigo){
        for (Produto produto : listaDeProdutos) {
            if(produto!=null){
                if(produto.codigo==codigo){
                    produto.imprimir();
                    return;
                }
            }
        }
        System.out.println("Produto não Encontrado");
    }
    public void imprimirLista(){
        for (Produto produto : listaDeProdutos) {
            if(produto!=null) produto.imprimir();
        }
    }
}
