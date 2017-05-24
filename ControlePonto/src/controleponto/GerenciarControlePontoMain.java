
package controleponto;

public class GerenciarControlePontoMain {

    
    public static void main(String[] args) throws InterruptedException {
        
        Gerente gr =  new Gerente(1, "Marcos", "Marcos@outlook.om", "12345", "MarcosGR", "12345");
        Operador op = new Operador(2, "Paulo Cesar", "PauloCesar@gmail.com", "23456", 10);
        Secretaria sc = new Secretaria(3, "Luciana", "Luciana@hotmail.com", "34567", "(xx) xxxx - xxxx", "15");
        
        RegistroPonto rp = new RegistroPonto();
        
        rp.apresentarRegistroPonto(gr);
        rp.apresentarRegistroPonto(op);
        rp.apresentarRegistroPonto(sc);
        
    }
    
}
