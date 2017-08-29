
package aula0203_prjcomputadores;


public class PrincipalComputador {

  
    public static void main(String[] args) {
        Computador c1 = new Computador();
        c1.setMarca("Hp");
        c1.setModelo("Pavilon");
        c1.setCor("Prata");
        c1.setNumeroSerie(1234);
        c1.setPreco(1000);
        c1.imprimir();
        c1.calcularValor();
        c1.imprimir();
        
        Computador c2 = new Computador();
        c2.setMarca("IBM");
        c2.setModelo("Lenovo");
        c2.setCor("Preto");
        c2.setNumeroSerie(2345);
        c2.setPreco(2000);
        c2.imprimir();
        c2.calcularValor();
        c2.imprimir();
        
        int resposta = c2.alterarValor(-200);
        if(resposta==1){
            System.out.println("Preco Alterado: " + c2.getPreco());
        }else{
            System.out.println("Preço não Alterado.");
        }
        c2.imprimir();
        
    }
    
}
