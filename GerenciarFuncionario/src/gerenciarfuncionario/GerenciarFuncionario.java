package gerenciarfuncionario;


public class GerenciarFuncionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gerente gerente = new Gerente();
        
       
        gerente.setId(1);
        gerente.endereco.setLogradouro("Rua das Amoras ");
        gerente.endereco.setNumero(123);
        gerente.endereco.setCidade("Mogi Mirim");
        gerente.endereco.setEstado("Sao Paulo");
        gerente.setNome("Zeca Camargo");
        
        gerente.setSalario(5000);
        
        gerente.imprimir();
        
    }
    
}
