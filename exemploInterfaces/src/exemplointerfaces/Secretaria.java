package exemplointerfaces;


public class Secretaria extends Funcionario implements Logavel {

    @Override
    public void efetuarLogin() {
        GerenciarAcesso ga = new GerenciarAcesso();
        ga.acessar(this);
        System.out.println("Secretaria Logou");
    }

    @Override
    public void efetuarLogout() {
         GerenciarAcesso ga = new GerenciarAcesso();
        ga.logoff(this);
        System.out.println("Secretaria efetuou Logoff");
    }
    
}
