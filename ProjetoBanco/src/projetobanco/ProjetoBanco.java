
package projetobanco;


public class ProjetoBanco {


    public static void main(String[] args) {
        // TODO code application logic here
        // Cliente: João que tem um conta corrente.
        // João depositará 1000. 
        // Um gerente atribuiu um limite ao João de 1000
        // João fará dois saques: 1) 500. e o 2) será de 3000.
        Corrente c1 = new Corrente(1, "João", 1000);
        //Fazer o deposito de 1000
        c1.depositar(1000);
        System.out.println("Saldo do:  " + c1.getNomeCliente());
        System.out.println(c1.getSaldo());
        System.out.println("");
        //Fazer o saque de 500
        boolean retorno = c1.sacar(500);
        mensagem(retorno, c1);
        
        Poupanca p = new Poupanca(2, "Maria", 22);
        p.depositar(3800);
        p.depositar(1500);
        System.out.println("Saldo da poupanca: " + p.getSaldo());
        
        //Verificar patrimonio do Banco
        GerenciarContas gc = new GerenciarContas();
        gc.adicionarConta(c1);
        gc.adicionarConta(p);
        System.out.println("Total do Patrimonio do Banco: ");
        System.out.println(gc.getTotal());
    }

    private static void mensagem(boolean retorno, Corrente c1) {
        if(retorno)
            System.out.println("Saque efetuado, novo saldo: " + c1.getSaldo());
        else
            System.out.println("Saque não efetuado, saldo: " + c1.getSaldo());
    }
    
}
