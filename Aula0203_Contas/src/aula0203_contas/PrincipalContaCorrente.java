package aula0203_contas;

import java.util.Scanner;

public class PrincipalContaCorrente {

    //Atributos
    public ContaCorrente cc = new ContaCorrente();

    //Métodos
    public static void main(String[] args) {
        PrincipalContaCorrente pcc = new PrincipalContaCorrente();
        int opc = 0;
        while (opc != 5) {
            System.out.println("1.. Cadastrar");
            System.out.println("2.. Depositar");
            System.out.println("3.. Sacar");
            System.out.println("4.. Consultar");
            System.out.println("41.. Tela Cadastro");
            System.out.println("5.. Sair");
            System.out.println("Digite sua opção : ");
            Scanner sc = new Scanner(System.in);
            opc = Integer.parseInt(sc.nextLine());
            switch (opc) {
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
                case 41:
                    ContaView telinha = new ContaView();
                    telinha.setVisible(true);
                    break;
                case 5:
                    System.out.println("FIM");
                    break;
                default:
                    System.out.println("Opção Inválida");
            }
        }
    }

    public void execCadastrar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero da conta: ");
        cc.setConta(sc.nextLine());
        System.out.println("Digite o nome do cliente: ");
        cc.setNomeCliente(sc.nextLine());
        System.out.println("Conta cadastrada com sucesso");
        System.out.println("");
    }

    public void execConsulta() {
        System.out.println("Dados da Conta");
        cc.imprimir();
    }

    public void execSaque() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do saque: ");
        double valor = Double.parseDouble(sc.nextLine());
        int retorno = cc.sacar(valor);
        if (retorno == 1) {
            System.out.println("Saque efetuado com sucesso");
        } else {
            System.out.println("Não tem saldo suficiente");
        }
    }

    public void execDeposito() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do deposito: ");
        double valor = Double.parseDouble(sc.nextLine());
        cc.depositar(valor);
        System.out.println("Depósito efetuado com sucesso");
    }

}
