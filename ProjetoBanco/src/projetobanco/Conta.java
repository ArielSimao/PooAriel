/*
 * Aulas professor Maromo.
 */
package projetobanco;

/**
 *
 * @author maromo
 */
public abstract class Conta {
    private int numero;
    private String nomeCliente;
    private double saldo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    //método depositar
    //public void depositar(double valor){
    //    saldo +=  valor;
   // }
    
    abstract void depositar(double valor);

    //Método sacar
    public boolean sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
            return true;
        }
        return false;
    }
    
    //Método construtor
    public Conta(int numero, String nomeCliente){
        this.numero = numero;
        this.nomeCliente = nomeCliente;
    }
}
