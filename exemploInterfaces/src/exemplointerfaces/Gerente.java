package exemplointerfaces;

public class Gerente extends Funcionario implements Logavel {

    @Override
    public void efetuarLogin() {
        GerenciarAcesso ga = new GerenciarAcesso();
        ga.acessar(this);
        System.out.println("Gerente Logou");
    }

    @Override
    public void efetuarLogout() {
        GerenciarAcesso ga = new GerenciarAcesso();
        ga.logoff(this);
        System.out.println("Gerente efetuou logoff");
    }

}
