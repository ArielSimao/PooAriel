package aula0203_prjacampamento;

import java.util.Scanner;

public class PrincipalAcampamento {

    public static void main(String[] args) {
        Acampamento membro = new Acampamento();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do membro: ");
        membro.setNome(sc.nextLine());
        System.out.println("Digite a idade do membro " + membro.getNome());
        membro.setIdade(Integer.parseInt(sc.nextLine()));
        membro.imprimir();
        membro.separarGrupo();

        membro.imprimir();
    }

}
