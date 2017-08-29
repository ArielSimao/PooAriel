package gerenciarconta;

public class GerenciarConta {


    public static void main(String[] args) {
        Corrente cc = new Corrente(1, "Chico", "Mogi", "mogi mirim", 200, 2000);
        System.out.println(cc.toString());
        double saque = 500;
        if(cc.sacar(saque)==true){
            System.out.println("Saque efetuado com sucesso");
        }else{
            System.out.println("Sem limite disponível");
        }
        System.out.println(cc.toString());
    }
    
}
