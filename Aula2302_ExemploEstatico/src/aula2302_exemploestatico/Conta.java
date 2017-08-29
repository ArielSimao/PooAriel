package aula2302_exemploestatico;

public class Conta {
    //Definindo atributos
    public int numConta;
    public String nomeCorrentista;
    public double saldo;
    public static double cpmf;
    
    public void depositar(double valor){
        saldo += valor;
    }
    
    public void sacar(double valor){
        if(valor<saldo){
            double taxa = valor * cpmf;
            double desconto = valor + taxa;
            saldo -= desconto;
        }else{
            System.out.println("Nao possui saldo");
        }
    }
    
    public void imprimir(){
        System.out.println("Dados da Conta");
        System.out.println("Nome: " + nomeCorrentista);
        System.out.println("Num Conta: " + numConta);
        System.out.println("Cpmf cobrado: " + cpmf);
        System.out.println("Saldo: " + saldo);
    }
}
