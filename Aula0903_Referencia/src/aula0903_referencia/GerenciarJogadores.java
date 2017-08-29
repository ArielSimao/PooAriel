package aula0903_referencia;

import java.util.Arrays;
import java.util.Scanner;

public class GerenciarJogadores {

    //Atributo desta classe
    public Aluno jogadores[];
    public int posicao;

    //método construtor
    public GerenciarJogadores() {
        jogadores = new Aluno[6];
        posicao = 0;
    }

    public static void main(String[] args) {
        int opc = 0;
        
        GerenciarJogadores gerenciar = new GerenciarJogadores();
        Scanner sc = new Scanner(System.in);
        while (opc != 9) { //9 para sair
            System.out.println("1.. Cadastrar");
            System.out.println("2.. Procurar");
            System.out.println("3.. Listar Todos Jogadores");
            System.out.println("9.. SAIR");
            System.out.println("Escolha opção: ");
            opc = Integer.parseInt(sc.nextLine());
            switch (opc) {
                case 1:
                    gerenciar.cadastrarJogador();
                    break;
                case 2:
                    gerenciar.procurarJogador();
                    break;
                case 3:
                    gerenciar.listarTodosJogadores();
                    break;
                case 9:
                    System.out.println("FIM");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    public void cadastrarJogador() {
        if (posicao < 6) {
            jogadores[posicao] = new Aluno();
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o RA: ");
            int pos = Integer.parseInt(sc.nextLine());
            jogadores[posicao].setRa(pos);
            System.out.println("Digite o Nome: ");
            jogadores[posicao].setNome(sc.nextLine());
            System.out.println("Cadastro efetuado com sucesso");
            posicao++;
        } else {
            System.out.println("Não há espaço para cadastro");
        }
    }

    public void procurarJogador() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o Ra a ser procurado: ");
        int proc = Integer.parseInt(sc.nextLine());
        for (Aluno aluno : jogadores) {
            if (aluno != null) {
                if (proc == aluno.getRa()) {
                    aluno.listarAluno();
                    break;
                }
            }
        }
    }

    public void listarTodosJogadores() {
        for (Aluno aluno : jogadores) {
            if(aluno!=null){
                aluno.listarAluno();
            }
        }
    }

}
