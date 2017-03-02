
package principalcontacorrente;

import java.util.Scanner;

public class PrincipalContaCorrente {
    public ContaCorrente cc = new ContaCorrente();
    
    public static void main(String[] args) {
        PrincipalContaCorrente pcc = new PrincipalContaCorrente();
        Scanner sc = new Scanner(System.in);
        int opc;
        pcc.menu();
        opc = Integer.parseInt(sc.nextLine());
        do{
            switch (opc){
                case 1:
                    pcc.execCadastrar();
                    break;
                case 2:
                    pcc.execDepositar();
                    break;
                case 3:
                    pcc.execConsulta();
                    break;
                case 4:
                    pcc.execSaque();
                    break;
                case 5:
                    System.out.println("Fim!");
                    break;
                default:
                    System.out.println("Opção inválida");
                    
            }
        }while(opc != 5);
    }
    public void execCadastrar(){
   
        
    }
    public void execConsulta(){
        
    }
    public void execSaque(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor à saquar:");
        
        if(cc.sacar(Double.parseDouble(sc.nextLine())) == 1)
            System.out.println("Saque efetuado com sucesso");
        else
            System.out.println("Valor na conta não é suficiente");
            
    }
    public void execDepositar(){
        
    }
    private void menu(){
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Depositar");
        System.out.println("3 - Consultar");
        System.out.println("4 - Sacar");
        System.out.println("5 - Sair");
        System.out.println("Escolha sua opção: ");
    }
    
    
}
