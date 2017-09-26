
package projetofolha;


public class GerenciarFolha {


    public static void main(String[] args) {
        Usuario u = new Usuario();
        u.idUsuario = 1;
        u.nome = "Administrador Zequinha";
        u.tipoUsuario = Tipo.administrador;
        Folha folha = new Folha();
        folha.idFunc = 1;
        folha.nomeFunc = "Faxineira Das Dores";
        //Definir o salário da faxineira
        folha.setSalario(1500.00, u.tipoUsuario);
        System.out.println("Salário : " + folha.getSalario(u.tipoUsuario));
    }
    
}
