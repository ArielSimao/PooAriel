/*
 * Aulas professor Maromo.
 */
package exemplointerfaces;

import java.util.List;

/**
 *
 * @author maromo
 */
public class ExemploInterfacesTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fornecedor f = new Fornecedor();
        Gerente g = new Gerente();
        Gerente g1 = new Gerente();
        Secretaria s = new Secretaria();
        Operador o = new Operador();
        Cliente c = new Cliente();
        s.efetuarLogin();
        g.efetuarLogin();
        g1.efetuarLogin();
        GerenciarAcesso ga = new GerenciarAcesso();
        System.out.println("Acessando: " + ga.getTotalAcesso());
        List<Logavel> lista = ga.getLista();
        for (Logavel item : lista) {
            System.out.println(item.getClass() + " - " + item.hashCode());
        }
    }
    
}
