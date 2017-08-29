package aula2302_exemploestatico;

public class TesteConta {


    public static void main(String[] args) {
        Conta.cpmf = 0.0059;
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        conta1.nomeCorrentista = "Joao";
        conta1.numConta = 1;
        conta1.saldo = 100.0;
        conta1.sacar(10.0);
        
        
        conta2.nomeCorrentista = "Chico";
        conta2.numConta = 2;
        conta2.saldo = 200;
        
        conta1.imprimir();
        conta2.imprimir();
    }
    
}
