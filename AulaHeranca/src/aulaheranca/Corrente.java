/*
 * Aulas professor Maromo.
 */
package aulaheranca;

/**
 *
 * @author maromo
 */
public class Corrente extends Conta {
   private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
   
   @Override
    public void sacar(double v){
        if(v <= (this.getSaldo() + limite)){
            this.setSaldo(this.getSaldo()-v);
        }
    }
}
