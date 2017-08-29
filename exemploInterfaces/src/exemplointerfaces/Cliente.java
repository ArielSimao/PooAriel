package exemplointerfaces;

public class Cliente implements Logavel {

    @Override
    public void efetuarLogin() {
        //Aqui a lógica de negocio - 
        //Como um cliente loga
        //Uma vez que as credenciais estiverem OK
        //Da sequencia
        GerenciarAcesso ga = new GerenciarAcesso();
        ga.acessar(this);
        System.out.println("Cliente Logou");
    }

    @Override
    public void efetuarLogout() {
        //Logica anterior
        GerenciarAcesso ga = new GerenciarAcesso();
        ga.logoff(this);
        System.out.println("Cliente efetuou Logoff");
    }
    
}
