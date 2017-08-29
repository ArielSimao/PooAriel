/*
 * Aulas professor Maromo.
 */
package aula0203_contas;

/**
 *
 * @author maromo
 */
public class ContaCorrente {

    private String conta;
    private double saldo;
    private String nomeCliente;

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int sacar(double valor) {
        if(valor <= saldo){
            saldo -= valor;
            return 1;
        }
        return 0;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void imprimir() {
        System.out.println("Conta: " + conta);
        System.out.println("Saldo: " + saldo);
        System.out.println("Nome Cliente: " + nomeCliente);
        System.out.println("");
    }
}
