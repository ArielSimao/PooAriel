package gerenciarfolha;

public class GerenciarFolha {

    public static void main(String[] args) {
        // TODO code application logic here
        Endereco e = new Endereco();
       Secretaria s = new Secretaria();
       s.setIdFuncionario(1);
       s.endereco.setLogradouro("Rua da Camelias");
       s.endereco.setCidade("mogi Mirim");
       s.setRamal(123);
       s.imprimir();
        System.out.println("");
       Operador o = new Operador();
       o.setIdFuncionario(2);
       o.setNome("Juca");
       o.endereco.setCidade("Campinas");
       o.setSalarioMes(0.0);
       o.setSalHora(30.0);
       o.imprimir();
       
    }
    
}
