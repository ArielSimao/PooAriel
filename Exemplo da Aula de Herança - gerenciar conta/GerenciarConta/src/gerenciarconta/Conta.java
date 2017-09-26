package gerenciarconta;

public abstract class Conta {
    private int numero;
    private String nomeCliente;
    private String agencia;
    private String cidade;
    protected double saldo;
    
    public Conta(int numero, String nomeCliente,
            String agencia, String cidade,
            double saldo){
        this.numero = numero;
        this.nomeCliente = nomeCliente;
        this.agencia = agencia;
        this.cidade = cidade;
        this.saldo = saldo;
    }
    
    public double mostrarSaldo(){
        return this.saldo;
    }
    
       
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Dados da Conta \n");
        sb.append("Numero: ").append(numero).append("\n");
        sb.append("Nome: ").append(nomeCliente).append("\n");
        sb.append("Agencia: ").append(agencia).append("\n");
        sb.append("Cidade: ").append(cidade).append("\n");
        sb.append("Saldo R$ ").append(saldo).append("\n");
        return sb.toString();
    }
    
    public abstract boolean sacar(double valor);
}
