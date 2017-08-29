package gerenciarconta;


public class Poupanca extends Conta {
    private int diaAniversario;

    public Poupanca(int numero, String nomeCliente, 
            String agencia, String cidade, 
            double saldo, int diaAniversario) {
        super(numero, nomeCliente, agencia, cidade, saldo);
        this.diaAniversario = diaAniversario;
    }
    
   @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Dia Aniversário ").append(diaAniversario).append("\n");
        sb.append("-------------------------------------");
        return sb.toString();
    }

    @Override
    public boolean sacar(double valor) {
        boolean r = false;
        if(valor <= saldo){
            saldo -= valor;
            r = true;
        }
        return r;
    }
    
    
}
