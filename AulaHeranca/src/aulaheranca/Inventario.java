/*
 * Aulas professor Maromo.
 */
package aulaheranca;

/**
 *
 * @author maromo
 */
public class Inventario {
    private double total;
    
    public Inventario(){
        this.total = 0.0;
    }
    
    public double getInventario(){
        return total;
    }
    
    public void setInventario(Conta c){
        this.total += c.getSaldo();
    }
}
