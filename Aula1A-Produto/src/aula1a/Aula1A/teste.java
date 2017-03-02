
package aula1a.Aula1A;

public class teste {

    
    
    public static void main(String[] args) {
        //criar dois objetos do tipo produto
        //atribbuir dados a cada um deles
        //listar os dados dos dois produtos
        //modificar os dados do produto um
        //listar novamente os dados do produto um 
        
        Produto p1 = new Produto();
        Produto p2 = new Produto();
        
        p1.codProduto = 111;
        p1.descricao = "Coca-Cola";
        p1.preco = 5.82;
        p1.qntEstoque = 112;
        
        p2.codProduto = 115;
        p2.descricao = "Fanta Laranja";
        p2.preco = 4.50;
        p2.qntEstoque = 65;
        
        p1.listarProduto();
        p2.listarProduto();
        
        p1.qntEstoque = 900;
        p1.listarProduto();
    }
    
}
