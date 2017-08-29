package prjfuncionarios;

import java.util.Scanner;

public class PrincipalFuncionarios {
//Atributos
    public final int T = 10;
    public int indice =0;
    public Funcionario[] funcionarios = new Funcionario[T];
    
//Métodos
    public void execCadastro(){
        Scanner sc = new Scanner(System.in);
        if(indice<T){
            funcionarios[indice] = new Funcionario();
            System.out.println("Digite o Nome: ");
            funcionarios[indice].nome = sc.nextLine();
            System.out.println("Digite o RG: ");
            funcionarios[indice].rg = sc.nextLine();
            System.out.println("Digite o Salário: ");
            funcionarios[indice].salario = Double.parseDouble(sc.nextLine());
            //completar o codigo
            indice++;
            System.out.println("Cadastro efetuado");
        }else{
            System.out.println("Não há espaço na memória");
        }
    }
    public void execBonificacao(){
        Scanner sc = new Scanner(System.in);
        //System.out.println("Digite a posição do func: ");
        //int pos = Integer.parseInt(sc.nextLine());
                /*
        if((indice>0)&&(pos<=indice)){
            funcionarios[pos-1].imprimir();
            System.out.println("Digite o valor do aumento: ");
            double valor = Double.parseDouble(sc.nextLine());
            funcionarios[pos-1].bonificar(valor);
            funcionarios[pos-1].imprimir();
            System.out.println("Dados com o AUMENTO");
            System.out.println("-------------------");
        }else{
            System.out.println("Posição inválida");
        }*/
        System.out.println("Digite o RG procurado: ");
        String rgProc = sc.nextLine();
        for (Funcionario funcionario : funcionarios) {
            if(funcionario!=null){
                if(rgProc.equalsIgnoreCase(funcionario.rg)){
                    funcionario.imprimir();
                    System.out.println("Digite o valor do aumento: ");
                    double vlr = Double.parseDouble(sc.nextLine());
                    funcionario.bonificar(vlr);
                    funcionario.imprimir();
                    System.out.println("Bonificação realizada");
                }
            }
        }
        

    }
    public void execConsulta(){
     Scanner sc = new Scanner(System.in);
        System.out.println("Digite a posição do func: ");
        int pos = Integer.parseInt(sc.nextLine());
        if((indice>0)&&(pos<=indice)){
            funcionarios[pos-1].imprimir();
        }else{
            System.out.println("Posição inválida");
        }
    }
    public static void main(String[] args) {
        PrincipalFuncionarios pf = new PrincipalFuncionarios();
        Scanner sc = new Scanner(System.in);
        int opc=0;
        do{
            System.out.println(">>>> MENU <<<<");
            System.out.println("1) Cadastrar");
            System.out.println("2) Bonificar");
            System.out.println("3) Consultar");
            System.out.println("9) Sair");
            System.out.print("Sua Opção => ");
            opc = Integer.parseInt(sc.nextLine());
            switch(opc){
                case 1:
                    pf.execCadastro();
                    break;
                case 2:
                    pf.execBonificacao();
                    break;
                case 3:
                    pf.execConsulta();
                    break;
                case 9:
                    System.out.println("Fim");
                    break;
                default:
                    System.out.println("Escolha novamente");
                   
            } //Final switch
        }while(opc!=9); //Final while
        //Final do main
    }
    
}
