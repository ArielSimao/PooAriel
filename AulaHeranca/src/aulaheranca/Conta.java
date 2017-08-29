/*
 * Aulas professor Maromo.
 */
package aulaheranca;

/**
 *
 * @author maromo
 */
public abstract class Conta {
    private int idConta;
    private Cliente cliente;
    private double saldo;
    
    public Conta(){
        this.cliente = new Cliente();
    }

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void depositar(double v){
        if(v > 0){
            this.saldo+= v;
        }
    }
    public void sacar(double v){
        if(v<= this.saldo){
            this.saldo-= v;
        }
    }
    public void gerarExtrato(){
        System.out.println("Dados da Conta");
        System.out.println("Cliente: ");
        System.out.println("Nome: " + this.cliente.getNome());
        System.out.println("Conta: " + this.idConta);
        System.out.println("Saldo: " + this.saldo);
    }
}
