/*
 * Aulas professor Maromo.
 */
package projetobanco;

/**
 *
 * @author maromo
 */
public class Poupanca extends Conta {
    private int diaAniversario;

    public int getDiaAniversario() {
        return diaAniversario;
    }

    public void setDiaAniversario(int diaAniversario) {
        this.diaAniversario = diaAniversario;
    }
    
    //Método construtor
    public Poupanca(int numero, String nomeCliente, int diaAniversario){
        super(numero, nomeCliente);
        this.diaAniversario = diaAniversario;
    }

    @Override
    public void depositar(double valor) {
        //Regra propria para depositar
        setSaldo(getSaldo()+ valor);
    }
    
}
