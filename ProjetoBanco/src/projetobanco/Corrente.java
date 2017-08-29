/*
 * Aulas professor Maromo.
 */
package projetobanco;

/**
 *
 * @author maromo
 */
public class Corrente extends Conta{
    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    //Reescrita do método sacar
    
    @Override
    public boolean sacar(double valor){
        //Regra - checar o saldo e limite
        if(valor<= (getSaldo() + limite)){
            setSaldo(getSaldo() - valor);
            return true;
        }
        return false;
    }
    
    //Método construtor
    public Corrente(int numero, String nomeCliente, double limite){
        super(numero, nomeCliente);
        this.limite = limite;
    }

    @Override
    public void depositar(double valor) {
        //Regra propria para depositar
        setSaldo(getSaldo()+ valor);
    }
}
