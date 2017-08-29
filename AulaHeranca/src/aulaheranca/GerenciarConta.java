package aulaheranca;


public class GerenciarConta {


    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        c1.setIdCliente(11);
        c1.setNome("João da Poupanca");
        
        Cliente c2 = new Cliente();
        c2.setIdCliente(21);
        c2.setNome("José da Corrente");
       
        Poupanca p = new Poupanca();
        p.setIdConta(11);
        p.setCliente(c1);
        p.depositar(550.99);
        p.gerarExtrato();
        
        
        Corrente c = new Corrente();
        c.setIdConta(111);
        c.setCliente(c2);
        c.depositar(1200.00);
        c.sacar(700.00);
        c.gerarExtrato();
        
        Inventario inv = new Inventario();
        inv.setInventario(c);
        inv.setInventario(p);
        System.out.println("Total de dinheiro");
        System.out.println("no Banco");
        System.out.println(inv.getInventario());
        
    }
    
}
