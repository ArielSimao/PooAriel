
package gerenciaacampamento;
import java.util.Scanner;
public class GerenciaAcampamento {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Acampamento membro = new Acampamento();
        
        System.out.println("Digite o nome do acampante");
        membro.setNome(sc.nextLine());
        System.out.println("Digite a idade do acampante");
        membro.setIdade(Integer.parseInt(sc.nextLine()));
        
        membro.imprimir();
        membro.separaGrupo();
        membro.imprimir();

        
    }
    
}
