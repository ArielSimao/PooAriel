package aula1602a;


public class Teste {


    public static void main(String[] args) {
        //Criar dois objetos do tipo produto
        //Atribuir dados a cada um deles
        //Listar os dados dos dois produtos
        //Modificar os dados do produto 1
        //Listar novamente os dados do produto 1
        Produto p1 = new Produto();
        Produto p2 = new Produto();
        
        p1.codProduto = 111;
        p1.descricao = "Coca-cola";
        p1.preco = 2.89;
        p1.qtdEstoque = 1000;
        
        p2.codProduto = 222;
        p2.descricao = "Fanta Uva";
        p2.preco = 2.79;
        p2.qtdEstoque = 100;
        
        p1.listarProduto();
        p2.listarProduto();
        
        p1.qtdEstoque = 900;
        p1.listarProduto();
    }
    
}
