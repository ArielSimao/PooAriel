
package principalcontacorrente;

public class ContaCorrente {
    
    private String conta;
    private double saldo;
    private String nomeCliente;
    
    public int sacar(double valor){
        if(valor <= saldo ){
            saldo -= valor;
            return 1;
        }
        return 0;        
    }
    public void depositar(double valor){
        saldo += valor;
    }
    public void imprimir(){
        
        System.out.println("Nome Cliente"+nomeCliente);
        System.out.println("Número da conta" +conta);
        System.out.println("Saldo atual "+saldo);
        System.out.println("");
    }
}
