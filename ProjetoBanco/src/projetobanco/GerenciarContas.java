package projetobanco;


public class GerenciarContas {
    private double total;
    
    public double getTotal(){
        return total;
        //Retorna o total do saldo de todas as contas
    }
    public GerenciarContas(){
        total = 0;
    }
    
    public void adicionarConta(Conta x){
        total += x.getSaldo();
    }
    
}
