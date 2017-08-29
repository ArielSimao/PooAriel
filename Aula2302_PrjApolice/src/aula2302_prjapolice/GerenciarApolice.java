package aula2302_prjapolice;


public class GerenciarApolice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Apolice apolice = new Apolice();
        apolice.setNomeSegurado("Joaozinho Trinta");
        apolice.setIdade(77);
        apolice.setValorPremio(1200.99f);
        apolice.imprimir();
        
    }
    
}
