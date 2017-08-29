package aula0203_prjcontas;

public class ContaCorrente {

    private String agencia;
    private String conta;
    private String nomeCliente;
    private double saldo;

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
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
    
    public int sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
            return 1;
        }
        return 0;
    }
    public void imprimir(){
        System.out.println("Agencia: " + agencia);
        System.out.println("Conta: " + conta);
        System.out.println("Nome: " + nomeCliente);
        System.out.println("Saldo: " + saldo);
        System.out.println("");
    }
    public void depositar(double valor){
        saldo += valor;
    }

}
