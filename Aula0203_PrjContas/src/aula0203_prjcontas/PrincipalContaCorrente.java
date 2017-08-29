
package aula0203_prjcontas;

import java.util.Scanner;

public class PrincipalContaCorrente {

    public ContaCorrente cc = new ContaCorrente();
    
    public static void main(String[] args) {
        PrincipalContaCorrente pcc = new PrincipalContaCorrente();
        int opc = 0;
        while(opc!=5){
            System.out.println("1.. Cadastrar");
            System.out.println("2.. Depositar");
            System.out.println("3.. Sacar");
            System.out.println("4.. Consultar");
            System.out.println("5.. Sair");
            System.out.println("Sua opção: ");
            Scanner sc = new Scanner(System.in);
            opc = Integer.parseInt(sc.nextLine());
            switch(opc){
                case 1: 
                    pcc.execCadastrar();
                    break;
                case 2:
                    pcc.execDeposito();
                    break;
                case 3:
                    pcc.execSaque();
                    break;
                case 4:
                    pcc.execConsulta();
                    break;
                case 5:
                    System.out.println("FIM");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
        
    }
    public void execCadastrar(){
        System.out.println("Cadastro de conta");
        System.out.println("Digite o nome: ");
        Scanner sc = new Scanner(System.in);
        cc.setNomeCliente(sc.nextLine());
        System.out.println("Digite a Agencia: ");
        cc.setAgencia(sc.nextLine());
        System.out.println("Digite a conta corrente: ");
        cc.setConta(sc.nextLine());
        System.out.println("Conta cadastra com sucesso");
    }
    public void execConsulta(){
        System.out.println("Dados da Conta");
        cc.imprimir();
        System.out.println("");
    }
    public void execSaque(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do saque: ");
        double vlr = Double.parseDouble(sc.nextLine());
        int resposta = cc.sacar(vlr);
        if(resposta==1){
            System.out.println("Saque efetuado com sucesso");
        }else{
            System.out.println("Você não possui saldo suficiente");
        }
    }
    public void execDeposito(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do deposito: ");
        double vlr = Double.parseDouble(sc.nextLine());
        cc.depositar(vlr);
        System.out.println("Depósito efetuado com sucesso");
    }
    
}
