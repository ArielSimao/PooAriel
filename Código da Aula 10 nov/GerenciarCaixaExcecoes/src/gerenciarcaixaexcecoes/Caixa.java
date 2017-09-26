package gerenciarcaixaexcecoes;


public class Caixa {
    private double saldo;
    
    public double getSaldo(){
        return saldo;
    }
    
    public void sacar(double valor) throws SemSaldoException {
        try {
           if(valor<=saldo){
               saldo -= valor;
           }else{
               throw new SemSaldoException();
           } 
        } catch (SemSaldoException e) {
            throw e;
        } catch (Exception e) {
            throw e;
        }
    }

    public void depositar(double valor) {
        saldo += valor;
    }
}
