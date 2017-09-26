package gerenciarconta;

public class Corrente extends Conta{
    private double limite;

    public Corrente(int numero, String nomeCliente, 
            String agencia, String cidade, 
            double saldo, double limite) {
        super(numero, nomeCliente, agencia, cidade, saldo);
        this.limite = limite;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Limite R$ ").append(limite).append("\n");
        sb.append("-------------------------------------");
        return sb.toString();
    }

    @Override
    public boolean sacar(double valor) {
        boolean r = false;
        if(valor <= (saldo + limite)){
            saldo -= valor;
            r = true;
        }
        return r;
    }
  
}
