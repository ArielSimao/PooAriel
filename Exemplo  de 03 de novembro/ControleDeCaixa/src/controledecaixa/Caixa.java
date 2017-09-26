package controledecaixa;

public class Caixa {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    //Método depositar
    public String depositar(double valor){
        if(valor<=0){
            return "Valor inválido para depósito\n";
        }
        saldo += valor;
        return "Depósito efetuado com sucesso\n";
    }
    //Método sacar
    public String sacar(double valor){
        if(valor<=0){
            return "Valor inválido para saque\n";
        }
        if(valor>saldo){
            return "Não possui saldo para saque\n";
        }
        saldo -= valor;
        return "Saque efetuado com sucesso\n";
    }
}
